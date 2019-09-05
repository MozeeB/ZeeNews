package com.zeeb.indonews.data.services

import com.zeeb.indonews.data.model.ResponseNews
import io.reactivex.Single
import retrofit2.http.GET

interface NewsServices {

    @GET("")
    fun getTopHeadlines(): Single<ResponseNews>
}