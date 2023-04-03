package com.sum.searchimageapp.ui.components

import com.sum.searchimageapp.network.ApiService
import com.sum.searchimageapp.network.model.PixabayResponse
import com.sum.searchimageapp.util.Constant
import com.sum.searchimageapp.util.Resource
import java.lang.Exception
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {


    suspend fun getQueryItems(q:String): Resource<PixabayResponse> {
        return  try{

            val result = apiService.getQueryImages(query = q, apiKey = Constant.KEY, imageType = "photo")
            Resource.Success(data = result)
        }catch (e:Exception){
            Resource.Error(message = e.message.toString())
        }
    }


}