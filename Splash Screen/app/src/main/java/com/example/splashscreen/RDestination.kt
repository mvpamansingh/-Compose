package com.example.splashscreen

interface Destination {

    val route:String
}


object splash:Destination{
    override val route= "Splash"
}

object home:Destination{
    override val route= "Home"

}



