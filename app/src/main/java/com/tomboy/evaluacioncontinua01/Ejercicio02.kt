package com.tomboy.evaluacioncontinua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tomboy.evaluacioncontinua01.model.EvaluacionContinua

class Ejercicio02 : AppCompatActivity() {
    lateinit var nota01: EditText
    lateinit var pesoNota01: EditText
    lateinit var nota02: EditText
    lateinit var pesoNota02: EditText
    lateinit var nota03: EditText
    lateinit var pesoNota03: EditText
    lateinit var nota04: EditText
    lateinit var pesoNota04: EditText

    lateinit var resultado: TextView

    lateinit var calcular: Button
    lateinit var nuevo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)

        nota01 = findViewById(R.id.inputNota01)
        pesoNota01 = findViewById(R.id.inputPesoNota01)
        nota02 = findViewById(R.id.inputNota02)
        pesoNota02 = findViewById(R.id.inputPesoNota02)
        nota03 = findViewById(R.id.inputNota03)
        pesoNota03 = findViewById(R.id.inputPesoNota03)
        nota04 = findViewById(R.id.inputNota04)
        pesoNota04 = findViewById(R.id.inputPesoNota04)

        resultado = findViewById(R.id.lblResultado)

        calcular = findViewById(R.id.btnCalcularNota)
        nuevo = findViewById(R.id.btnLimpiar)

        calcular.setOnClickListener{
            var objNota01 = nota01.text.toString().toFloat()
            var objPesoNota01 = pesoNota01.text.toString().toFloat()
            var objNota02 = nota02.text.toString().toFloat()
            var objPesoNota02 = pesoNota02.text.toString().toFloat()
            var objNota03 = nota03.text.toString().toFloat()
            var objPesoNota03 = pesoNota03.text.toString().toFloat()
            var objNota04 = nota04.text.toString().toFloat()
            var objPesoNota04 = pesoNota04.text.toString().toFloat()

            var objeto = EvaluacionContinua(objNota01, objPesoNota01, objNota02, objPesoNota02, objNota03, objPesoNota03, objNota04, objPesoNota04)

            resultado.setText(objeto.CalcularSituacionAcademica())

        }
        nuevo.setOnClickListener {
            nota01.setText("");pesoNota01.setText("")
            nota02.setText("");pesoNota02.setText("")
            nota03.setText("");pesoNota03.setText("")
            nota04.setText("");pesoNota04.setText("")
            resultado.setText("")

            nota01.requestFocus()
        }
    }
}