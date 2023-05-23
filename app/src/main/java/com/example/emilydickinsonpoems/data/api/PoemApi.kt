package com.example.emilydickinsonpoems.data.api

import com.example.emilydickinsonpoems.domain.Poem
import retrofit2.Call
import retrofit2.http.GET

interface PoemApi {

    @GET("/author/Emily%20Dickinson")
    fun getPoemsByAuthor(): Call<List<Poem>>
}