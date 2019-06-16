package com.rifqimfahmi.animationplayground.animations.a00_base.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rifqimfahmi.animationplayground.animations.a00_base.model.Visitable

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

abstract class BaseAdapter<T : BaseTypeFactory>(
    private val typeFactory: T
) : RecyclerView.Adapter<BaseViewHolder<Visitable<T>>>() {

    val data: List<Visitable<T>> = initList()

    abstract fun initList(): List<Visitable<T>>

    override fun getItemViewType(position: Int): Int {
        return data[position].type(typeFactory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Visitable<T>> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return typeFactory.create(view, viewType) as BaseViewHolder<Visitable<T>>
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Visitable<T>>, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

}