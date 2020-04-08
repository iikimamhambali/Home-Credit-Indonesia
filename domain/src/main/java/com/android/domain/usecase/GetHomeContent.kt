package com.android.domain.usecase

import com.android.domain.helper.Transformer
import com.android.domain.helper.UseCase
import com.android.domain.model.CoreDataEntity
import com.android.domain.repository.ContentRepository
import io.reactivex.Observable

class GetHomeContent(
    transformer: Transformer<CoreDataEntity>,
    private val repository: ContentRepository
) : UseCase<CoreDataEntity>(transformer) {

    override fun createObservable(data: Map<String, Any>?): Observable<CoreDataEntity> {
        return repository.getContent()
    }
}