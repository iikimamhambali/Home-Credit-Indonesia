package com.android.homecreditindonesia.dependencies.module

import com.android.data.model.CoreDataResultMapper
import com.android.homecreditindonesia.model.CoreDataViewMapper
import org.koin.dsl.module

val mapperModule = module {

    single { CoreDataViewMapper() }

    single { CoreDataResultMapper() }
}