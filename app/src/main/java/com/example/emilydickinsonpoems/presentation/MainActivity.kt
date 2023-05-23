package com.example.emilydickinsonpoems.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.emilydickinsonpoems.R
import com.example.emilydickinsonpoems.data.api.PoemApiFactory
import com.example.emilydickinsonpoems.domain.Poem
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call

class MainActivity : AppCompatActivity() {

    private val adapter : PoemAdapter = PoemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val item = findViewById<RecyclerView>(R.id.item)

        item.layoutManager = LinearLayoutManager(this)
        PoemApiFactory.create().getPoemsByAuthor {
                poems: List<Poem> ->
            adapter.setItems(poems)
        }

        item.adapter = adapter

    }
}





