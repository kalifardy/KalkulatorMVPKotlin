package com.app.keyalive.mvpkotlinkalkulator2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    lateinit var  presenter :HitungPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresenter()
        initView()
    }

    private fun initView() {
        tambah.setOnClickListener {
            presenter.hitungTambah(input1,input2)
        }
        kurang.setOnClickListener {
            presenter.hitungKurang(input1,input2)
        }
        kali.setOnClickListener {
            presenter.hitungKali(input1,input2)
        }
        bagi.setOnClickListener {
            presenter.hitungBagi(input1,input2)
        }
    }
    override fun Kosong() {
        Toast.makeText(this,"jangan kosong kamu gak akan kuat", Toast.LENGTH_SHORT).show()

    }

    override fun Hasil(nilai: String) {
        txt_hasil.text=nilai
    }

    private fun initPresenter() {
presenter= HitungPresenterImp(this)    }
}
