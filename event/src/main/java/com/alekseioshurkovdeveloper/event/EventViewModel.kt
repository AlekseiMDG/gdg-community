package com.alekseioshurkovdeveloper.event

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alekseioshurkovdeveloper.event.data.EventRepository

class EventViewModelFactory(private val repository: EventRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return EventViewModel(repository) as T
    }
}

class EventViewModel(private val repository: EventRepository) : ViewModel() {
}