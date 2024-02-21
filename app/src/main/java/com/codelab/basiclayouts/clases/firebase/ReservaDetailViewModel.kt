package com.codelab.basiclayouts.clases.firebase

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.codelab.basiclayouts.clases.firebase.repositories.ReservaRepository
import com.codelab.basiclayouts.clases.modelo.Reserva
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

import java.util.UUID
import javax.inject.Inject

class ReservaDetailViewModel : ViewModel() {

    private val _state = MutableStateFlow(ReservaDetailState())
    val state: StateFlow<ReservaDetailState> = _state.asStateFlow()
    private val reservaRepository:ReservaRepository= ReservaRepository()
    fun updateState(newState:ReservaDetailState){
        _state.value=newState
    }
    fun addNewReserva(nombre: String, apellidos: String,fechainicio:String,fechaFin:String,lugar:String,descripcion:String){

        val id=UUID.randomUUID().toString()
        val reserva = Reserva(id,nombre,apellidos,fechainicio,fechaFin,lugar,descripcion)

        reservaRepository.addNewReserva(reserva)
    }


}