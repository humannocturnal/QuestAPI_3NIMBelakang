package com.example.praktikum12.ui.ViewModel

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.praktikum12.ui.Navigation.PengelolaHalaman

@Composable
fun MahasiswaApp() {
    MyApplicationTheme {
        Scaffold { innerPadding ->
            PengelolaHalaman(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun MyApplicationTheme(content: @Composable () -> Unit) {
        TODO("Not yet implemented")
}
