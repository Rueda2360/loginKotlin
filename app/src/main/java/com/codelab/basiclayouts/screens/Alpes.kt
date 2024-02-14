package com.codelab.basiclayouts.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.codelab.basiclayouts.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Alpes(navController: NavController){
    Scaffold {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Image(painter = painterResource(id = R.drawable.alpes), contentDescription = "imagen")
}
