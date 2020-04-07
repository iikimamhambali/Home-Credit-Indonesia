package com.android.homecreditindonesia.dependencies.module

import com.android.homecreditindonesia.helper.NetworkUtils
import org.koin.dsl.module

val networkModule = module {

    single { NetworkUtils(get()) }
}