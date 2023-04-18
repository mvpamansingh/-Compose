package com.example.basicnavigation

interface Destination {

    val route:String
}

object home:Destination{
    override val route= "Home"

}

object Menu:Destination{
    override val route= "Menu"
}
object third:Destination{
    override val route= "Third"
}