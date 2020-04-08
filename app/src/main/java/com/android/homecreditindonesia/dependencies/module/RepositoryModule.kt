package com.android.homecreditindonesia.dependencies.module

import com.android.data.repository.ContentRepository
import org.koin.dsl.module

val repositoryModule = module {

    single { ContentRepository(get(), get()) as com.android.domain.repository.ContentRepository }
}