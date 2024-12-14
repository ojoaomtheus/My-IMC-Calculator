package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val  KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

    val resultado = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

    val tvResultado = findViewById<TextView>(R.id.Result)
    val tvClassificacao = findViewById<TextView>(R.id.classificacao)

    tvResultado.text = resultado.toString()

    val classificacao: String
    val corClassificacao: Int

     if(resultado <= 18.5f){
         classificacao = "MAGREZA"
         corClassificacao = Color.YELLOW
        } else if (resultado > 18.5 && resultado <=24.9f){
         classificacao = "NORMAL"
         corClassificacao = Color.GREEN
        } else if (resultado > 25f && resultado <=29.9f){
         classificacao = "SOBREPESO"
         corClassificacao = Color.YELLOW
        } else if (resultado > 30f && resultado <= 39.9f){
         classificacao = "OBESIDADE"
         corClassificacao = Color.RED
        } else {
         classificacao = "OBESIDADE GRAVE"
         corClassificacao = Color.RED
        }

        tvClassificacao.text = classificacao
        tvClassificacao.setTextColor(corClassificacao)

    }

}