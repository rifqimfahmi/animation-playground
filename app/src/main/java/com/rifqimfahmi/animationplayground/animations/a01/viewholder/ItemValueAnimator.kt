package com.rifqimfahmi.animationplayground.animations.a01.viewholder

import android.view.View
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseViewHolder
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelValueAnimator

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-16.
 */

class ItemValueAnimator(itemView: View) : BaseViewHolder<ModelValueAnimator>(itemView) {
    override fun bind(model: ModelValueAnimator) {

    }

    companion object {
        const val LAYOUT = R.layout.item_value_animator
    }
}
