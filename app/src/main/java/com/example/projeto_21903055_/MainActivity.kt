package com.example.projeto_21903055_

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_calcular)
            .setOnClickListener{ Calcular() }

    }
    private fun Calcular() {
        if (!checkIfEmpty()) {
            var Nome = findViewById<EditText>(R.id.nome).text.toString()
            var Idade = findViewById<EditText>(R.id.idade).text.toString()
            var tamanho=0
            if (findViewById<Switch>(R.id.radioButton5k).isChecked){


            }
        }

    }
    private fun checkIfEmpty(): Boolean{
        if (findViewById<EditText>(R.id.nome).toString() == "") {
            if (findViewById<EditText>(R.id.idade).toString() == "") {
                var alertDialog: AlertDialog = AlertDialog.Builder(this) //set icon
                    .setIcon(R.drawable.ic_launcher_foreground) //set title
                    .setTitle("Não indicou a idade e/ou nome") //set message
                    .setMessage("Por favor indique o nome e/ou idade em falta") //set positive button
                    .setPositiveButton(
                        "Ok",
                        DialogInterface.OnClickListener { dialogInterface, i -> //set what would happen when positive button is clicked

                        })
                    .show()
                return true
            }
        }
        return false
    }

}