package com.example.puc_registro_peso.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize()
data class Medicao(var peso: Double, var data: Date): Parcelable {
    
}
