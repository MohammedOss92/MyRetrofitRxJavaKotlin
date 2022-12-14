package com.example.myretrofitrxjava.data.repository

import com.example.myretrofitrxjava.data.network.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}