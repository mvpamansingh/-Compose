package com.example.basicnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController)
{
    Column() {
        Text(text = "HomeScree", fontSize = 32.sp, fontFamily = FontFamily.Cursive)


        Button(onClick = {
            navController.navigate(Menu.route)
        })

        {

            Text(text = "Navigate")
        }
    }
}