package com.codelab.basiclayouts.clases.firebase

import com.codelab.basiclayouts.clases.modelo.Reserva

data class ReservaDetailState(
    val id:String="",
    val nombre:String="",
    val apellidos:String="",
    val fechainicio:String="",
    val fechafin:String="",
    val lugar:String="",
    val descripcion:String=""

)