package com.codelab.basiclayouts.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codelab.basiclayouts.clases.firebase.ReservaDetailState
import com.codelab.basiclayouts.clases.firebase.ReservaDetailViewModel
import com.codelab.basiclayouts.screens.Alpes
import com.codelab.basiclayouts.screens.FirstScreen
import com.codelab.basiclayouts.screens.LoginScreen
import com.codelab.basiclayouts.screens.RegisterScreen
import com.codelab.basiclayouts.screens.ReservaDetailScreen
import com.codelab.basiclayouts.screens.SplashScreen

@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = AppScreens.SplashScreen.route){
        composable(route=AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route=AppScreens.SecondScreen.route){
            Alpes(navController)
        }
        composable(route=AppScreens.ThirdScreen.route){
            LoginScreen(navController)
        }
        composable(route=AppScreens.FourthScreen.route){
            RegisterScreen(navController)
        }
        composable(route=AppScreens.FifthScreen.route){
            ReservaDetailScreen(navController,)
        }
        composable(route=AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }
    }
}