package com.codelab.basiclayouts.clases.soothe

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MySootheApp(windowSize: WindowSizeClass,navController:NavController) {
    if (windowSize.widthSizeClass == WindowWidthSizeClass.Compact) {
        MySootheAppPortrait(navController)
    } else {
        MySootheAppLandscape()
    }
}
