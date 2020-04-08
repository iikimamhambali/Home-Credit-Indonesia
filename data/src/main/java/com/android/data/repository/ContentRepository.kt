package com.android.data.repository

import com.android.data.model.CoreDataResultMapper
import com.android.data.network.HomeService
import com.android.domain.model.CoreDataEntity
import com.android.domain.store.ContentStore
import io.reactivex.Observable

class ContentRepository(
    private val service: HomeService,
    private val mapper: CoreDataResultMapper
) : ContentStore {

    override fun getContent(): Observable<CoreDataEntity> {
        return service.getContentHome().map { mapper.transform(it) }
    }
}