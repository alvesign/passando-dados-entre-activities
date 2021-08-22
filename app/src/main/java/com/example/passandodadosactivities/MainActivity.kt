package com.example.passandodadosactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_passar_dados.setOnClickListener {
            val intent = Intent(applicationContext, SegundaActivity::class.java)

            //Passar dados
            intent.putExtra("nome", "Márcio")
            intent.putExtra("idade", 30)
            startActivity(intent)
        }


    }
}