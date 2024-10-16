package com.glenda.projetocompras

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class LoginFragment : Fragment() {

    private lateinit var btnEntrar: Button
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = arguments
        val nomeAluno = bundle?.getString("nomeAluno")
        val numFaltas = bundle?.getInt("numFaltas")

        Log.i("login", "Nome do aluno: $nomeAluno, Número de faltas: $numFaltas")


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)


        btnVoltar = view.findViewById(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
        return view
    }


}



