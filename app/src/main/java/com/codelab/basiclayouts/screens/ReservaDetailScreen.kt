package com.codelab.basiclayouts.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import com.codelab.basiclayouts.clases.firebase.ReservaDetailState
import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.codelab.basiclayouts.clases.firebase.ReservaDetailViewModel
import java.util.UUID


@Composable
fun ReservaDetailScreen(
    navController: NavController
) {
    var reservaDetailViewModel:ReservaDetailViewModel=viewModel()
    val reservaDetailState by reservaDetailViewModel.state.collectAsState()
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var lugar by remember { mutableStateOf("") }
    var fechaInicio by remember { mutableStateOf("") }
    var fechaFin by remember { mutableStateOf("") }
    var descripcion by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = nombre,
                onValueChange = { nombre = it },
                label = {
                    Text(text = "Nombre")
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = apellidos,
                onValueChange = { apellidos = it },
                label = {
                    Text(text = "Apellidos")
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = lugar,
                onValueChange = { lugar = it },
                label = {
                    Text(text = "Localización")
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = fechaInicio,
                onValueChange = { fechaInicio = it },
                label = {
                    Text(text = "Fecha de Inicio")
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = fechaFin,
                onValueChange = { fechaFin = it },
                label = {
                    Text(text = "Fecha de Fin")
                }
            )

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                value = descripcion,
                onValueChange = { descripcion = it },
                label = {
                    Text(text = "Descripción")
                }
            )
        }


            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                onClick = {
                    reservaDetailViewModel.updateState(
                        reservaDetailState.copy(
                            nombre = nombre,
                            apellidos = apellidos,
                            fechainicio = fechaInicio,
                            fechafin = fechaFin,
                            lugar = lugar,
                            descripcion = descripcion,
                        )
                    )
                    reservaDetailViewModel.addNewReserva(nombre,apellidos,fechaInicio,fechaFin,lugar,descripcion)

                },
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.primary
                )
            ) {
                Text(
                    text = "Add New Reserva",
                    color = Color.White
                )
            }


    }
}



















