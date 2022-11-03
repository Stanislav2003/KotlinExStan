package com.stanss.recyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stanss.recyclerview.Adapter.ItemAdapter
import com.stanss.recyclerview.data.FitxaPersones
import com.stanss.recyclerview.IntroduirDades

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        //val myDataset = Datasource().loadAffirmations()

        recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val llistaFitxaPersones = ArrayList<FitxaPersones>()


        var Nom : String = intent.getStringExtra("NomAct1").toString()
        val Carrec : String = intent.getStringExtra("CarrecAct1").toString()
        val Edat : String = intent.getStringExtra("EdatAct1").toString()


        llistaFitxaPersones.add(FitxaPersones(Nom,Carrec,Edat,R.drawable.dice_1))
       // llistaFitxaPersones.add(FitxaPersones("Miquel","Alumne","25",R.drawable.dice_2))
       // llistaFitxaPersones.add(FitxaPersones("Joan","Alumne","25",R.drawable.dice_3))


        recyclerView.adapter = ItemAdapter(llistaFitxaPersones)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)


        var torna : Button = findViewById(R.id.botoTorna)

        torna.setOnClickListener {

            var escriuCategoria : EditText =  findViewById(R.id.escriuCat)
            var categoryText = escriuCategoria.text.toString()

            if(categoryText.isEmpty()){
                categoryText= "categoria no seleccionada"
            }
            val intent = Intent(this, IntroduirDades::class.java)
            intent.putExtra("categoriaDone",categoryText)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        // Fetch newItems from database
        recyclerView.adapter
        recyclerView.adapter?.notifyDataSetChanged()
    }


}