package com.glenda.projetocompras

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_inicial)

        var txtResultado: TextView = findViewById(R.id.txtResultado)

        var bundle = intent.extras

        txtResultado.text = bundle?.getString("aluno")


    }
}