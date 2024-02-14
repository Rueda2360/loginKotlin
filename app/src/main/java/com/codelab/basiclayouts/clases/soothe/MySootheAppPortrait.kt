package com.codelab.basiclayouts.clases.soothe

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.codelab.basiclayouts.clases.home.HomeScreen
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun MySootheAppPortrait(navController: NavController) {
    MySootheTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation(modifier=Modifier,navController) }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}