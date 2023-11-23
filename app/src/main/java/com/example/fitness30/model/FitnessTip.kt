package com.example.fitness30.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class FitnessTip(
    @StringRes val name: Int,
    @DrawableRes val image: Int,
    @StringRes val desc: Int
)