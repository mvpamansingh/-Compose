package com.example.basicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.basicnavigation.ui.theme.BasicNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            myNavigation()
        }
    }
}

@Composable
fun myNavigation()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = home.route)
    {


        composable(home.route)
        {
            HomeScreen(navController)
        }
        composable(Menu.route)
        {
            MenuList(navController)
        }

        composable(third.route)
        {

            thirdScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicNavigationTheme {

    }
}