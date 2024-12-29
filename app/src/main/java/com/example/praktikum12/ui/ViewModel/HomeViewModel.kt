package com.example.praktikum12.ui.ViewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.praktikum12.Model.Mahasiswa
import com.example.praktikum12.Repository.MahasiswaRepository
import kotlinx.coroutines.launch

sealed class HomeUiState {
    object Loading : HomeUiState()
    data class Success(val mahasiswaList: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
}

class HomeViewModel(private val repository: MahasiswaRepository) : ViewModel() {
    var uiState: HomeUiState = HomeUiState.Loading
        private set

    init {
        fetchMahasiswa()
    }

    fun fetchMahasiswa() {
        viewModelScope.launch {
            uiState = try {
                HomeUiState.Success(repository.getMahasiswa())
            } catch (e: Exception) {
                HomeUiState.Error
            }
        }
    }
}


