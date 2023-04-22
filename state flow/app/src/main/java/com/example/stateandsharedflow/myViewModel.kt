package com.example.stateandsharedflow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class myViewModel: ViewModel()
{


    private val  _ans= MutableStateFlow(1)   //
    // mutable private stateflow availabe only
    //inside view model for operation on data

    val ans = _ans
    // available to outer use for UI purpose

    fun add()
    {
        _ans.value = _ans.value +1
    }
}