package com.glenda.projetocompras

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
//desenvolvimento 11/10 ate 15/10/24 final
class MainActivity : AppCompatActivity() {
    private lateinit var btnCadastro : Button
    private lateinit var btnLogin : Button
    private lateinit var btnSobree:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnSobree.setOnClickListener{
            var intent = Intent(this, TelaInicial::class.java)
            intent.putExtra("aluno", "Glenda")
            intent.putExtra("senha", "dog")
            startActivity(intent)
        }
        btnCadastro = findViewById(R.id.btnCadastro)
        btnCadastro.setOnClickListener{


            val cadastroFragment = CadastroFragment()

            val bundle = bundleOf(
                "nomeAluno" to "Glenda",
                "numFaltas" to 0
            )
            cadastroFragment.arguments = bundle

            //suport o begin. No replace passa o fragmento e cadastro
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, cadastroFragment)
                .commit()
        }

        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, LoginFragment())
                .commit()
        }
    }
}