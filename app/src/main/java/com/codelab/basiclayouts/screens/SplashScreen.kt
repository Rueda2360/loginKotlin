package com.codelab.basiclayouts.screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codelab.basiclayouts.R
import com.codelab.basiclayouts.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        LaunchedEffect(key1 = true){
            delay(5000)
            navController.popBackStack()
            navController.navigate(AppScreens.FourthScreen.route)
        }
        Splash()
    }

}
@Composable
fun Splash(){
    Column (
        modifier=Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo hotel",
        Modifier.size(150.dp,150.dp)
    )

    }
}