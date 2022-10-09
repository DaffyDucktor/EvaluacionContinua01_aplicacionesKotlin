package com.tomboy.evaluacioncontinua01.model

class Asistente {
    var codigo:String=""
    var nombre:String=""
    var dni:String=""
    var numeroHoras:Float=0F
    var tarifaHora:Float=0F

    constructor(
        codigo: String,
        nombre: String,
        dni: String,
        numeroHoras: Float,
        tarifaHora: Float
    ) {
        this.codigo = codigo
        this.nombre = nombre
        this.dni = dni
        this.numeroHoras = numeroHoras
        this.tarifaHora = tarifaHora
    }

    fun CalcularHorasExtra():Float{
        if (numeroHoras > 48){
            return numeroHoras - 48
        }
        return 0F
    }

    fun CalcularSueldoBruto():Float{
        if (numeroHoras > 48){
             return ((numeroHoras - 48) * tarifaHora * 2) + (48 * tarifaHora)
        }
        return numeroHoras * tarifaHora
    }

    fun CalcularDescuentoESSALUD():Float{
        return CalcularSueldoBruto() /100 * 12
    }

    fun CalcularDescuentoAFP():Float{
        return CalcularSueldoBruto() / 100 * 11
    }

    fun CalcularDescuentoTotal():Float{
        return CalcularDescuentoESSALUD() + CalcularDescuentoAFP()
    }

    fun CalcularSueldoNeto():Float{
        return CalcularSueldoBruto() - CalcularDescuentoTotal()
    }
}