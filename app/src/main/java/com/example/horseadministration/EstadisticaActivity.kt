package com.example.horseadministration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.horseadministration.model.Caballo
import kotlinx.android.synthetic.main.activity_estadistica.*

class EstadisticaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadistica)
        val caballoList = listOf<Caballo>(
            Caballo("Galán", R.drawable.caba1, 10, "ANDALUZ","Energéticos, Voluminosos y Alimentos Proteicos", "Gris", "Carrera lisa","Si"),
            Caballo("Ambicioso", R.drawable.caba2,11,"ÁRABE","Alimentos Comerciales o balanceados","Beige","Carrera de obstáculos", "No"),
            Caballo("Lucky", R.drawable.caba3,20,"TENNESSEE WALKING","Aditivos y Energéticos","Beige","Carrera mixta", "Si"),
            Caballo("Cuervo", R.drawable.caba4,14,"PURA SANGRE","Voluminosos y Alimentos Proteicos",  "Cafe","Carrera de venta o reclamar", "Si"),
            Caballo("Kentucky", R.drawable.caba5,8,"APALUSA","Energéticos", "Blanco con manchas negras","Hándicap","Si"),
            Caballo("Zorro", R.drawable.caba6,21,"MORGAN","Aditivos, Voluminosos y Alimentos Proteicos", "Cafe oscuro","Carrera de condición","Si"),
            Caballo("Sultán", R.drawable.caba7,22,"QUARTER HORSE","Maíz y Cebada", "Cafe","Carrera de pesos por edad.","Si"),
            Caballo("Trueno", R.drawable.caba8,16,"PAINT HORSE","Aditivos y Energéticos", "Blanco con manchas cafes","Carrera de pesos por edad.","No"),
            Caballo("Atrevido", R.drawable.caba9,9,"MINIATURA", "Avena","Gris","Carrera de pesos por edad.", "No")
        )

        cantidad.text = caballoList.size.toString()
        vacu.text = caballoList.filter { s -> s.vacunas == "Si" }.size.toString()
        novacu.text = caballoList.filter { s -> s.vacunas == "No" }.size.toString()


    }
}