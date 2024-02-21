package com.codelab.basiclayouts.clases.modelo

data class Reserva(
    val id:String,
    val nombre:String,
    val apellidos:String,
    val fechainicio:String,
    val fechafin:String,
    val lugar:String,
    val descripcion:String
){
    constructor():this("","","","","","","")
}