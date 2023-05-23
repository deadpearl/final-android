package com.example.emilydickinsonpoems.data.service

import com.example.emilydickinsonpoems.data.api.PoemApi
import com.example.emilydickinsonpoems.domain.Poem
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class PoemService(
    private val poemApi: PoemApi
) {

    fun getPoemsByAuthor(callback : (List<Poem>) -> Unit){
      poemApi.getPoemsByAuthor().enqueue(object :
          Callback<List<Poem>> {
          override fun onFailure(call: Call<List<Poem>>, t: Throwable) {
          }

          override fun onResponse(
              call: Call<List<Poem>>,
              response: Response<List<Poem>>
          ) {
              return callback(response.body() ?: emptyList())
          }
      })
    }
}
