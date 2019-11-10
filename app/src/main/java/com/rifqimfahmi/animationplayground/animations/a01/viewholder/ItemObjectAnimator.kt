package com.rifqimfahmi.animationplayground.animations.a01.viewholder

import android.animation.ObjectAnimator
import android.view.View
import android.widget.TextView
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseViewHolder
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelObjectAnimator

class ItemObjectAnimator(itemView: View) : BaseViewHolder<ModelObjectAnimator>(itemView) {

    private var tvObject: TextView? = itemView.findViewById(R.id.tv_object)

    override fun bind(model: ModelObjectAnimator) {
        val animator = ObjectAnimator.ofFloat(tvObject, "translationX", 500f).apply {

        }

        itemView.setOnClickListener {
            animator.start()
        }
    }

    companion object {
        const val LAYOUT = R.layout.item_object_animator
    }
}