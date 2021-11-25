package com.example.projeto_21903055_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PrimeiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)
        val extras = intent.extras
        if (extras != null) {
            val nif = extras.getString("NIF")
            val preco = extras.getDouble("Preco")
            Toast.makeText(this, "NIF:" + nif + ", a pagar: " + preco, Toast.LENGTH_LONG).show()
            calcular()
        }

    }
    private fun calcular(){
        findViewById<Button>(R.id.button_pagamento).setOnClickListener() {
            val nif: String = intent?.extras?.get("NIF") as String
            mostrarMainActivity(nif)
        }
    }
    fun mostrarMainActivity(nif:String) {
        val resumoIntent =  Intent(this,
            MainActivity::class.java // referência para classe da Activity
        )
        resumoIntent.putExtra("NIF",nif)
        startActivity(resumoIntent)
        finish()

    }
}