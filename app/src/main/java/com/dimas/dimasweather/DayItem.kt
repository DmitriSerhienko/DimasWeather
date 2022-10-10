package com.dimas.dimasweather

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val imageUtl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
