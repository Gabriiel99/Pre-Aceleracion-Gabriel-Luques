package com.example.movietmdb.services

import com.example.movietmdb.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface{

    @GET("/3/movie/popular?api_key=643987f1c045ddaca214c606db49df8b")
    fun getMovieList() : Call<MovieResponse>
}