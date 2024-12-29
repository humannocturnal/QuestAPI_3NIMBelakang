package com.example.praktikum12.ui.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum12.ui.ViewMahasiswa.HomeView
import com.example.praktikum12.ui.ViewMahasiswa.InsertView

@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HomeView(
                navigateToInsert = { navController.navigate(DestinasiInsert.route) }
            )
        }
        composable(DestinasiInsert.route) {
            InsertView(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}

