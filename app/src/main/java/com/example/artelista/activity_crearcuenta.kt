package com.example.artelista

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class activity_crearcuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crearcuenta)

        val toolbar: Toolbar = findViewById(R.id.tbCrearCuenta)
        setSupportActionBar(toolbar)
        supportActionBar!!.setTitle("CREAR CUENTA")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}