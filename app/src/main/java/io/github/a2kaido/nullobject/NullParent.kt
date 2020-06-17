package io.github.a2kaido.nullobject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

sealed class NullParent : Parcelable {
    @Parcelize
    object Null : NullParent()

    companion object {
        val list = listOf(Null)
    }
}
