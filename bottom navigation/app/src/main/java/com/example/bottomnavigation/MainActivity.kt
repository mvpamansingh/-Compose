package com.example.bottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            myApp()
            appme()
        }
    }
}

@Composable
fun appme()
{
    val scrollstate= rememberScrollState()
    Row(modifier = Modifier.padding(10.dp).horizontalScroll(scrollstate)) {
        category.forEach { categoryitem ->
            listlayout(category = categoryitem)

        }
    }
}



@Composable
fun listlayout(category:String)
{
    Button(onClick = { },
        colors = ButtonDefaults.buttonColors(Color(0XFFF7CA30)),
        shape = RoundedCornerShape(32.dp),
        modifier = Modifier.padding(5.dp)
        ) {
        
        Text(text = category)
    }
}

val category= listOf<String>("pizza","chicken rolls","luxary dish","elon musk","ratan tata")
@Composable
fun myApp()
{
    val navController= rememberNavController()
    Scaffold(bottomBar = { mybottomNavigation(navController = navController)}) {
        Box(modifier = Modifier.padding(it))
        {
            NavHost(navController = navController, startDestination =Home.route  )
            {


                composable(Home.route)
                {
                    homeScreen()
                }
                composable(Setting.route)
                {
                    settingScreen()
                }
            }
        }
    }
}


@Composable
fun mybottomNavigation(navController: NavController)
{
    val destinationList= listOf<destination>(
        Home,
        Setting
    )

    val  selectedIndex= rememberSaveable {
        mutableStateOf(0)
    }
    BottomNavigation() {

        destinationList.forEachIndexed{index, destination ->
            BottomNavigationItem(
                label= { Text(text = destination.title)},
                icon= { Icon(imageVector = destination.icon, contentDescription = destination.title)},
                selected = index==selectedIndex.value,
                onClick = {
                    selectedIndex.value =index
                    navController.navigate(destinationList[index].route){
                        popUpTo(Home.route)
                        launchSingleTop= true
                    }

                })
        }
    }

}