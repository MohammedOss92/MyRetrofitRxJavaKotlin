package com.example.myretrofitrxjava.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieList(@SerializedName("Search") val mList: List<Movie>)