package com.moriswala.navigationcomponenetsexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Money(val money: BigDecimal): Parcelable {

}