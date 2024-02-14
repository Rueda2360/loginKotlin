package com.codelab.basiclayouts.navigation

sealed class AppScreens(val route:String) {
    object FirstScreen:AppScreens("first_screen")
    object SecondScreen:AppScreens("second_screen")
    object ThirdScreen:AppScreens("third_screen")
}