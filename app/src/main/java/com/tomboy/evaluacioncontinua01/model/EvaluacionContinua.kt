package com.tomboy.evaluacioncontinua01.model

class EvaluacionContinua {

    var nota01:Float=0F
    var peso01:Float=0F
    var nota02:Float=0F
    var peso02:Float=0F
    var nota03:Float=0F
    var peso03:Float=0F
    var nota04:Float=0F
    var peso04:Float=0F

    constructor(
        nota01: Float,
        peso01: Float,
        nota02: Float,
        peso02: Float,
        nota03: Float,
        peso03: Float,
        nota04: Float,
        peso04: Float
    ) {
        this.nota01 = nota01
        this.peso01 = peso01
        this.nota02 = nota02
        this.peso02 = peso02
        this.nota03 = nota03
        this.peso03 = peso03
        this.nota04 = nota04
        this.peso04 = peso04
    }

    fun CalcularNota01():Float{
        return nota01 / 100 * peso01
    }
    fun CalcularNota02():Float{
        return nota02 / 100 * peso02
    }
    fun CalcularNota03():Float{
        return nota03 / 100 * peso03
    }
    fun CalcularNota04():Float{
        return nota04 / 100 * peso04
    }

    fun CalcularNotaFinal():Float{
        return CalcularNota01() + CalcularNota02() + CalcularNota03() + CalcularNota04()
    }

    fun CalcularSituacionAcademica(): String{
        if (CalcularNotaFinal()< 12.5){
            return "DESAPROBADO"
        }
        return "APROBADO"
    }

    fun CalcularNotaBaja():Float{
        if(nota03<nota04){
            return nota03
        }
        return nota04
    }
}