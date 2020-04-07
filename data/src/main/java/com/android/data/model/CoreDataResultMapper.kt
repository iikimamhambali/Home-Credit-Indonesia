package com.android.data.model

import com.android.domain.helper.Mapper
import com.android.domain.model.CoreDataEntity

class CoreDataResultMapper : Mapper<CoreDataResult, CoreDataEntity> {

    override fun transform(from: CoreDataResult): CoreDataEntity {
        val result = CoreDataEntity()
        result.section = from.section
        result.sectionTitle = from.sectionTitle
        result.items = result.items
        return result
    }
}