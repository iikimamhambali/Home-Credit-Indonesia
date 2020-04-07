package com.android.homecreditindonesia

import com.android.homecreditindonesia.base.BaseApplication
import com.android.homecreditindonesia.dependencies.library
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class HomeCreditApplication : BaseApplication() {

    override fun initApplication() {
        startKoin {
            modules(library)
            androidContext(this@HomeCreditApplication)
        }
    }
}