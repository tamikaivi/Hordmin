package com.example.horseadministration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            irLogin()
        }
        register.setOnClickListener {
            irRegistro()
        }
    }

    fun irRegistro() {
        var intent = Intent(this, RegistoActivity::class.java)
        startActivity(intent)
    }

    fun irLogin(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}