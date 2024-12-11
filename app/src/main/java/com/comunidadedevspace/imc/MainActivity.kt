package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Preciso conectar minha mainActivity com o xml


        val edtPeso = findViewById<TextInputEditText>(R.id.idt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.idt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {

            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {


                // mostrar mensagem para o usuario

            Snackbar.make(
                edtPeso,
                "preencha todos os campos",
                Snackbar.LENGTH_LONG
            )

                .show()


            } else {

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println("joao" + resultado)
            }

        }
    }
}



