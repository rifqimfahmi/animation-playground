package com.rifqimfahmi.animationplayground.animations.a00_base.adapter.viewholder

import android.view.View
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseViewHolder
import com.rifqimfahmi.animationplayground.animations.a00_base.model.ModelEmpty

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class ItemEmpty(itemView: View) : BaseViewHolder<ModelEmpty>(itemView) {

    override fun bind(model: ModelEmpty) {

    }

    companion object {
        const val LAYOUT = R.layout.item_empty
    }
}