package com.rifqimfahmi.animationplayground.animations.a00_base.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView


/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

abstract class BaseViewHolder<in T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(model: T)

}