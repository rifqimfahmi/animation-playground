package com.rifqimfahmi.animationplayground.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a01.PropertyAnimationOverview
import com.rifqimfahmi.animationplayground.model.Example
import kotlinx.android.synthetic.main.item_example.view.*

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class MainAdapter(val listener: ExampleItem.Listener) : RecyclerView.Adapter<ExampleItem>() {

    private val data = arrayListOf(
        Example(PropertyAnimationOverview.TITLE, PropertyAnimationOverview::class.java)
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleItem {
        return ExampleItem.create(parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExampleItem, position: Int) {
        holder.bind(data[position], listener)
    }
}

class ExampleItem(itemView: View) : RecyclerView.ViewHolder(itemView) {

    interface Listener {
        fun onExampleItemClick(example: Example)
    }

    fun bind(example: Example, listener: Listener) {
        with(itemView) {
            tv_title.text = example.title

            setOnClickListener {
                listener.onExampleItemClick(example)
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup): ExampleItem {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_example, parent, false)
            return ExampleItem(view)
        }
    }
}