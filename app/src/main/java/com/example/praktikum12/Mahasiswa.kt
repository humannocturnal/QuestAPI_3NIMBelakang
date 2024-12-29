package com.example.praktikum12


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktikum12.ui.Navigation.PengelolaHalaman


@Composable
fun MahasiswaApp() {
    Scaffold { innerPadding ->
        PengelolaHalaman(modifier = Modifier.padding(innerPadding))
    }
}
