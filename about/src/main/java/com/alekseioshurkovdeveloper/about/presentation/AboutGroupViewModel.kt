package com.alekseioshurkovdeveloper.about.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alekseioshurkovdeveloper.about.domain.AboutInteractor
import com.alekseioshurkovdeveloper.about.domain.model.AboutDomainModel
import com.alekseioshurkovdeveloper.about.presentation.model.AboutPresentationModel
import com.alekseioshurkovdeveloper.about.presentation.converter.AboutPresentationConverter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

const val TAG = "AboutGroupViewModel"

class AboutGroupViewModel(
    private val iteractor: AboutInteractor,
    private val converter: AboutPresentationConverter
) : ViewModel() {


    private var aboutUiModel: MutableLiveData<AboutPresentationModel> = MutableLiveData()
    private var loadingState: MutableLiveData<Boolean> = MutableLiveData()
    private var errorState: MutableLiveData<Boolean> = MutableLiveData()

    private var disposable: Disposable? = null

    init {
        disposable = iteractor
            .loadAboutInformation()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnTerminate { loadingState.value = false }
            .doOnSubscribe { loadingState.value = true }
            .subscribe({ model -> showScreen(model) },
                { e -> showError(e) })
    }

    override fun onCleared() {
        disposable?.let {
            it.dispose()
        }
    }

    public fun getAboutUI() = aboutUiModel

    public fun getLoadinState() = loadingState

    private fun showScreen(model: AboutDomainModel) {
        aboutUiModel.postValue(converter.convert(model))
    }

    private fun showError(e: Throwable) {
        Log.d(TAG, "Error load 'About' information: $e")

    }
}
