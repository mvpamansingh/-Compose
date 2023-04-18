package com.example.basicnavigation

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MenuList(navController: NavController)
{
    Text(text = "You navigated to next screen", fontFamily = FontFamily.Cursive, fontSize = 50.sp)
    Button(onClick = {
        navController.navigate(third.route)
    }) {
        Text(text = "navigate to third")
    }
}