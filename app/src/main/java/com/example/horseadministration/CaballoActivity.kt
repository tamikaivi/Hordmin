package com.example.horseadministration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_caballo.*

class CaballoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caballo)
        if(intent.extras != null){
            photo_view.setImageResource(intent.getIntExtra("imgURL",1))
            name.text= intent.getStringExtra("name")
            tx2.text = intent.getIntExtra("anio",1).toString()
            tx3.text = intent.getStringExtra("gen")
            tx4.text = intent.getStringExtra("ali")
            tx5.text = intent.getStringExtra("color")
            tx6.text = intent.getStringExtra("campeo")
            tx7.text = intent.getStringExtra("vacu")
        }
    }

}