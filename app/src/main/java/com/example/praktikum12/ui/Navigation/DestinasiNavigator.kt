package com.example.praktikum12.ui.Navigation


interface DestinasiNavigator {
    val route: String
}

object DestinasiHome : DestinasiNavigator {
    override val route = "home"
}

object DestinasiInsert : DestinasiNavigator {
    override val route = "insert"
}
