package com.dimas.dimasweather

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.dimas.dimasweather.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MediatorLiveData<WeatherModel>()
    val liveDataList = MediatorLiveData<List<WeatherModel>>()

}