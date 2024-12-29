package com.example.praktikum12.Service_API

import com.example.praktikum12.Model.Mahasiswa
import retrofit2.http.*

interface MahasiswaService {
    @GET("mahasiswa")
    suspend fun getAllMahasiswa(): List<Mahasiswa>

    @POST("mahasiswa")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

    @DELETE("mahasiswa/{nim}")
    suspend fun deleteMahasiswa(@Path("nim") nim: String)
}