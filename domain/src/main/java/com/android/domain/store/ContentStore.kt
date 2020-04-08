package com.android.domain.store

import com.android.domain.model.CoreDataEntity
import io.reactivex.Observable

interface ContentStore {

    fun getContent(): Observable<CoreDataEntity>
}