package com.android.homecreditindonesia.dependencies.module

import com.android.domain.usecase.GetHomeContent
import org.koin.dsl.module

val useCaseModule = module {

    single { GetHomeContent(get(), get()) }
}