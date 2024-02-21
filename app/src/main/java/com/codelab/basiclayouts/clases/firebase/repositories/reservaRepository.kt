package com.codelab.basiclayouts.clases.firebase.repositories


import com.codelab.basiclayouts.clases.modelo.Reserva
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ReservaRepository(){




        fun addNewReserva(reserva: Reserva){
            val filestore = FirebaseFirestore.getInstance()
            filestore.collection("Reservas").document(reserva.id).set(reserva)
        }


}
