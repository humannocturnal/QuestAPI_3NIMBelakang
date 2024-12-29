package com.example.praktikum12.Ri

import com.example.praktikum12.Model.Mahasiswa
import com.example.praktikum12.Repository.MahasiswaRepository
import com.example.praktikum12.Service_API.MahasiswaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer : AppContainer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2:8000/umyTI/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val mahasiswaService: MahasiswaService by lazy {
        retrofit.create(MahasiswaService::class.java)
    }


    override val mahasiswaRepository: MahasiswaRepository by lazy {
        object : MahasiswaRepository {
            override suspend fun getMahasiswa() = mahasiswaService.getAllMahasiswa()
            override suspend fun insertMahasiswa(mahasiswa: Mahasiswa) = mahasiswaService.insertMahasiswa(mahasiswa)
            override suspend fun deleteMahasiswa(nim: String) = mahasiswaService.deleteMahasiswa(nim)
        }
    }
}
