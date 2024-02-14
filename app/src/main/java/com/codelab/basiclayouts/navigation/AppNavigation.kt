package com.codelab.basiclayouts.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codelab.basiclayouts.screens.Alpes
import com.codelab.basiclayouts.screens.FirstScreen
import com.codelab.basiclayouts.screens.LoginScreen

@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = AppScreens.ThirdScreen.route){
        composable(route=AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route=AppScreens.SecondScreen.route){
            Alpes(navController)
        }
        composable(route=AppScreens.ThirdScreen.route){
            LoginScreen(navController)
        }
    }
}