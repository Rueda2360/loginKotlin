package com.codelab.basiclayouts.clases.soothe

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.codelab.basiclayouts.clases.home.HomeScreen
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Composable
fun MySootheAppLandscape() {
    MySootheTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                SootheNavigationRail()
                HomeScreen()
            }
        }
    }
}