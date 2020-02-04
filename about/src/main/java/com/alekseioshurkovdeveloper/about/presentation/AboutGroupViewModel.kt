package com.alekseioshurkovdeveloper.about.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alekseioshurkovdeveloper.about.domain.AboutInteractor
import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.presentation.model.AboutPresentationModel
import com.alekseioshurkovdeveloper.about.utils.ConverterToPresentationModel
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class AboutGroupViewModel(iteractor: AboutInteractor,
                          private val converter: ConverterToPresentationModel) : ViewModel() {

    var aboutUiModel: MutableLiveData<AboutPresentationModel> = MutableLiveData()

    private var disposable: Disposable? = null

    init {
        disposable = iteractor.loadAboutInformation()
            .subscribeOn(Schedulers.io())
            .subscribe({ model -> showScreen(model) },
                { e -> showError(e) })
    }

    override fun onCleared() {
        disposable?.let {
            it.dispose()
        }
    }

    private fun showScreen(model: AboutDomainModel) {
        aboutUiModel.postValue(converter.convert(model))
    }

    private fun showError(e: Throwable) {

    }
}
