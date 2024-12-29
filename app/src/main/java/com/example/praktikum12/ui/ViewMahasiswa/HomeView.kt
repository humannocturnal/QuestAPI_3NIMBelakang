package com.example.praktikum12.ui.ViewMahasiswa


import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.praktikum12.ViewModel.HomeViewModel
import com.example.praktikum12.ui.ViewModel.HomeUiState
import com.example.praktikum12.ui.ViewModel.HomeViewModel


@Composable
fun HomeView(
    viewModel: HomeViewModel = viewModel()
) {
    when (val state = viewModel.uiState) {
        is HomeUiState.Loading -> {/* Display loading */}
        is HomeUiState.Success -> {/* Display mahasiswa list */}
        is HomeUiState.Error -> {/* Display error */}
    }
}

