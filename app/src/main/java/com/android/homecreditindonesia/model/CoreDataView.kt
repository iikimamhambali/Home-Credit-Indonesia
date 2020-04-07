package com.android.homecreditindonesia.model

import android.os.Parcelable
import com.android.domain.model.DataListEntity
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class CoreDataView(
    @SerializedName("section") var section: String = "",
    @SerializedName("section_title") var sectionTitle: String = "",
    @SerializedName("items") var items: List<DataListEntity> = listOf()
) : Parcelable