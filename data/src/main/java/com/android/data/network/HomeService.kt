package com.android.data.network

import com.android.data.model.CoreDataResult
import io.reactivex.Observable
import retrofit2.http.GET

interface HomeService {

    @GET("home")
    fun getContentHome(): Observable<CoreDataResult>
}