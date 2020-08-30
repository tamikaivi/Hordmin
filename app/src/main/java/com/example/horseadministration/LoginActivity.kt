package com.example.horseadministration

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_login.setOnClickListener {
            irmenu()
        }
    }

    fun irmenu() {
        var sharedPreference = applicationContext.getSharedPreferences(getString(R.string.sharedPreferences), Context.MODE_PRIVATE)
        val nombreval = sharedPreference.getString("nombre","")
        val nombreva2 = sharedPreference.getString("pass","")
        val lognombre = loguser.text.toString()
        val logpassw = logpass.text.toString()
         if (nombreval != ""){
            if (nombreval.equals(lognombre) && nombreva2.equals(logpassw)){
                var intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Datos incorrectos", Toast.LENGTH_SHORT).show()

            }
        }else{
             Toast.makeText(this,"Datos incorrectos", Toast.LENGTH_SHORT).show()

         }

    }
}