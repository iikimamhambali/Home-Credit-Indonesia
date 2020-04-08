package com.android.domain.repository

import com.android.domain.model.CoreDataEntity
import io.reactivex.Observable

interface ContentRepository {

    fun getContent(): Observable<CoreDataEntity>

}