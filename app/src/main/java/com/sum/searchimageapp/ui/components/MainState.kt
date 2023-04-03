package com.sum.searchimageapp.ui.components

import com.sum.searchimageapp.network.model.Hit

data class MainState(
    val isLoading:Boolean=false,
    val data:List<Hit> = emptyList(),
    val error:String=""
)
