package com.tomboy.evaluacioncontinua01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tomboy.evaluacioncontinua01.model.Asistente

class Ejercicio01 : AppCompatActivity() {
    lateinit var codigo: EditText
    lateinit var nombre:EditText
    lateinit var dni:EditText
    lateinit var numeroHoras:EditText
    lateinit var tarifaHoras:EditText
    lateinit var horasExtra:TextView
    lateinit var sueldoBruto:TextView
    lateinit var descuentoESSALUD:TextView
    lateinit var descuentoAFP:TextView
    lateinit var descuentoTotal:TextView
    lateinit var sueldoNeto:TextView
    lateinit var nuevo:Button
    lateinit var calcular:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)
        codigo=findViewById(R.id.inputCodigo)
        nombre=findViewById(R.id.inputNombre)
        dni=findViewById(R.id.inputDNI)
        numeroHoras=findViewById(R.id.inputHoraTrabajo)
        tarifaHoras=findViewById(R.id.inputTarifaHora)
        horasExtra=findViewById(R.id.lblHoraExtra)
        sueldoBruto=findViewById(R.id.lblHoraExtra)
        descuentoESSALUD=findViewById(R.id.lblESSALUD)
        descuentoAFP=findViewById(R.id.lblAFP)
        descuentoTotal=findViewById(R.id.lblDsctoTotal)
        sueldoNeto=findViewById(R.id.lblNeto)
        nuevo=findViewById(R.id.btnNuevaOp)
        calcular=findViewById(R.id.btnCalcular)

        calcular.setOnClickListener{
            var cod = codigo.text.toString()
            var nom = nombre.text.toString()
            var objDni = dni.text.toString()
            var numHoras = numeroHoras.text.toString().toFloat()
            var tarHoras = tarifaHoras.text.toString().toFloat()
            var objeto= Asistente(cod, nom, objDni, numHoras, tarHoras)

            horasExtra.setText(String.format("%.2f",objeto.CalcularHorasExtra()))
            sueldoBruto.setText(String.format("%.2f",objeto.CalcularSueldoBruto()))
            descuentoESSALUD.setText(String.format("%.2f",objeto.CalcularDescuentoESSALUD()))
            descuentoAFP.setText(String.format("%.2f",objeto.CalcularDescuentoAFP()))
            descuentoTotal.setText(String.format("%.2f",objeto.CalcularDescuentoTotal()))
            sueldoNeto.setText(String.format("%.2f",objeto.CalcularSueldoNeto()))
        }
        nuevo.setOnClickListener {
            codigo.setText("");nombre.setText("");dni.setText("");numeroHoras.setText("");tarifaHoras.setText("")

            codigo.requestFocus()

        }
    }
}