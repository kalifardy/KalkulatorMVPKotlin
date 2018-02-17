package com.app.keyalive.mvpkotlinkalkulator2

import android.widget.EditText

/**
 * Created by keyalive on 17/02/2018.
 */
interface HitungPresenter {
    fun hitungTambah(nilai1:EditText,nilai2:EditText)
    fun hitungKurang(nilai1:EditText,nilai2:EditText)
    fun hitungKali(nilai1:EditText,nilai2:EditText)
    fun hitungBagi(nilai1:EditText,nilai2:EditText)
}