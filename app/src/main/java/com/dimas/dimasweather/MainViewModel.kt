package com.dimas.dimasweather

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MediatorLiveData<String>()
    val liveDataList = MediatorLiveData<List<String>>()



}