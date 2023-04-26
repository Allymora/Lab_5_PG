package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnIniciar: Button = findViewById(R.id.btnLogin)
        btnIniciar.setOnClickListener({v ->
            val intent = Intent(v.getContext(), MainActivity::class.java)
            startActivity(intent)
        })

        val tvCrear: TextView = findViewById(R.id.tvCreaUnaAqui)
        tvCrear.setOnClickListener({v ->
            val intent = Intent(v.getContext(), activity_crearcuenta::class.java)
            startActivity(intent)
        })
    }
}