package com.example.emilydickinsonpoems.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.emilydickinsonpoems.R
import com.example.emilydickinsonpoems.domain.Poem
import kotlinx.android.synthetic.main.item.view.*

class PoemAdapter(
)
    : RecyclerView.Adapter<PoemAdapter.PoemViewHolder>() {

    private val poems: MutableList<Poem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return PoemViewHolder(view)
    }

    override fun onBindViewHolder(holder: PoemViewHolder, position: Int) {
        val poem = poems[position]
        holder.bind(poem)
    }

    override fun getItemCount(): Int {
        return poems.size
    }

    fun setItems(items: List<Poem>) {
        poems.clear()
        poems.addAll(items)
        notifyDataSetChanged()
    }

    inner class PoemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(poem: Poem) {
            itemView.title.text = poem.title
            itemView.author.text = poem.author
            itemView.lines.text = poem.lines.toString()
            itemView.linecount.text = poem.linecount.toString()
        }
    }
}
