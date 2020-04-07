package com.android.homecreditindonesia.model

import com.android.domain.helper.Mapper
import com.android.domain.model.CoreDataEntity

class CoreDataViewMapper : Mapper<CoreDataEntity, CoreDataView> {

    override fun transform(from: CoreDataEntity): CoreDataView {
        val coreData = CoreDataView()
        coreData.section = from.section
        coreData.sectionTitle = from.sectionTitle
        coreData.items = from.items
        return coreData
    }
}