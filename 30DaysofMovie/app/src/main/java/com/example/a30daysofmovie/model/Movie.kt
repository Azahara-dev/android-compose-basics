package com.example.a30daysofmovie.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Movie(
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val descriptionRes: Int
)
