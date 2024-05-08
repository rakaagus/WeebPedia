package com.example.weebspedia.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val imageVector: ImageVector,
    val screen: Screen
)