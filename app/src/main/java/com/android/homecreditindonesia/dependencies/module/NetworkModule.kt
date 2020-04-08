package com.android.homecreditindonesia.dependencies.module

import com.android.data.network.HomeService
import com.android.homecreditindonesia.R
import com.android.data.helper.LiveDataCallAdapterFactory
import com.android.data.helper.NetworkServiceFactory
import com.android.data.helper.NetworkUtils
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    single { NetworkUtils(get()) }

    single { NetworkServiceFactory.makeClientService(get(), get()) }

    single { NetworkServiceFactory.makeLoggingInterceptor() }

    single { NetworkServiceFactory.makeCache(get()) }

    single { NetworkServiceFactory.makeGson() }

    single(named("RetrofitHome")) {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(get()))
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .client(get<OkHttpClient>(named("general_client")))
            .baseUrl(androidContext().getString(R.string.base_url) + "/")
            .build()
    }
    single { get<Retrofit>(named("RetrofitHome")).create(HomeService::class.java) }
}