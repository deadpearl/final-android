package com.example.emilydickinsonpoems.data.api

import com.example.emilydickinsonpoems.data.service.PoemService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PoemApiFactory private constructor() {
    companion object {
        private const val BASE_URL = "https://poetrydb.org"
        private var retrofit: Retrofit? = null

        fun getInstance(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }

        fun create(): PoemService {
            val poemApi = PoemService(
                getInstance().create(PoemApi::class.java)
            )
            return poemApi
        }
    }
}


