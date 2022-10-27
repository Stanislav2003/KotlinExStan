package com.stanss.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText

class IntroduirDades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduir_dades)

        var seguent :Button = findViewById(R.id.buttonSeguent)

        var et1 :EditText =  findViewById(R.id.Nom)
        var et2 : EditText = findViewById(R.id.Carrec)
        var et3 : EditText = findViewById(R.id.Edat)

        var NomActivity1 = et1.text.toString()
        var CarrecActivity1  = et1.text.toString()
        var EdatActivity1  = et1.text.toString()




        seguent.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NomAct1",NomActivity1)
            intent.putExtra("CarrecAct1",CarrecActivity1)
            intent.putExtra("EdatAct1",EdatActivity1)

            startActivity(intent)
        }

    }
}