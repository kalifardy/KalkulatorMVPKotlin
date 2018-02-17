package com.app.keyalive.mvpkotlinkalkulator2

import android.widget.EditText

/**
 * Created by keyalive on 17/02/2018.
 */
class HitungPresenterImp :HitungPresenter {

    var modelView : MainView? =null

    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    override fun hitungTambah(nilai1: EditText, nilai2: EditText) {
        var satu = nilai1.text.toString()
        var dua = nilai2.text.toString()
        if (satu.isNotEmpty() && dua.isNotEmpty()){
            var nilaisatu = satu.toDouble()
            var nilaidua = dua.toDouble()

            var  hasil = nilaisatu+nilaidua
            modelView?.Hasil(hasil.toString())
        }else{

        }
    }

    override fun hitungKurang(nilai1: EditText, nilai2: EditText) {
        var satu = nilai1.text.toString()
        var dua = nilai2.text.toString()
        if (satu.isNotEmpty()&&dua.isNotEmpty()){
            var nilaisatu = satu.toDouble()
            var nilaidua = dua.toDouble()

            var  hasil = nilaisatu-nilaidua
            modelView?.Hasil(hasil.toString())
        } else{

        }
    }

    override fun hitungKali(nilai1: EditText, nilai2: EditText) {
        var satu = nilai1.text.toString()
        var dua = nilai2.text.toString()
        if (satu.isNotEmpty()&&dua.isNotEmpty()){
            var nilaisatu = satu.toDouble()
            var nilaidua = dua.toDouble()

            var  hasil = nilaisatu*nilaidua
            modelView?.Hasil(hasil.toString())
        }  else{

        }
    }

    override fun hitungBagi(nilai1: EditText, nilai2: EditText) {
        var satu = nilai1.text.toString()
        var dua = nilai2.text.toString()
        if (satu.isNotEmpty()&&dua.isNotEmpty()){
            var nilaisatu = satu.toDouble()
            var nilaidua = dua.toDouble()

            var  hasil = nilaisatu/nilaidua
            modelView?.Hasil(hasil.toString())
        }  else{

        }  }

}