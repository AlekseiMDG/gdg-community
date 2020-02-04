package com.alekseioshurkovdeveloper.about.presentation.model

data class AboutPresentationModel(
    val title: String,
    val description: String,
    val photo: String,
    val status: String,
    val location: String,
    val count: Int,
    val leaders: List<LeaderPresentationModel>
)
