package com.alekseioshurkovdeveloper.about.presentation.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alekseioshurkovdeveloper.about.domain.AboutInteractor
import com.alekseioshurkovdeveloper.about.presentation.AboutGroupViewModel
import com.alekseioshurkovdeveloper.about.presentation.converter.AboutPresentationConverter

class AboutGroupFactory(private val iteractor: AboutInteractor,
                        private val converter: AboutPresentationConverter
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AboutGroupViewModel(iteractor, converter) as T
    }
}