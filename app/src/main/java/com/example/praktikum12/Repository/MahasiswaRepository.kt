package com.example.praktikum12.Repository

import com.example.praktikum12.Model.Mahasiswa

interface MahasiswaRepository {
    suspend fun getMahasiswa(): List<Mahasiswa>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(nim: String)
}
