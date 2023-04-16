package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface destination {

    val route:String
    val icon: ImageVector
    val title:String

}


object Home:destination{
    override val route= "home"
    override val icon= Icons.Filled.Home
    override val title= "Home Screen"
}

object Setting:destination{
    override val route= "setting"
    override val icon= Icons.Filled.Settings
    override val title= "Settings Screen"
}