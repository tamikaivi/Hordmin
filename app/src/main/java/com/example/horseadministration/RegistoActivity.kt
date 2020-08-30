package com.example.horseadministration

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registo.*

class RegistoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registo)
        btn_registrar.setOnClickListener {
            guardar()
            irlogin()
        }
    }

    fun guardar(){
        var sharedPreference = applicationContext.getSharedPreferences(getString(R.string.sharedPreferences), Context.MODE_PRIVATE)
        with(sharedPreference.edit()){
            putString("nombre",nombre.text.toString())
            putString("pass",pass.text.toString())
            putString("edad",edad.text.toString())
            commit()
        }
    }
    fun irlogin() {
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}