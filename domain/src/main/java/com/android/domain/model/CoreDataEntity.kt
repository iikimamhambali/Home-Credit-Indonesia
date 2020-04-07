package com.android.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoreDataEntity(
    var section: String = "",
    var sectionTitle: String = "",
    var items: List<DataListEntity> = listOf()
) : Parcelable