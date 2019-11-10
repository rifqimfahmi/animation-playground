package com.rifqimfahmi.animationplayground.animations.a01.viewholder

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.view.View
import android.widget.TextView
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseViewHolder
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelValueAnimator

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-16.
 */

class ItemValueAnimator(itemView: View) : BaseViewHolder<ModelValueAnimator>(itemView) {

    private val placeHolder = itemView.findViewById<TextView>(R.id.tv_placeholder)

    override fun bind(model: ModelValueAnimator) {
        val animator = ValueAnimator.ofInt(0, 50000).apply {
            duration = 1000
            addUpdateListener { valueAnimator ->
                placeHolder.text = valueAnimator.animatedValue.toString()
            }
        }

        itemView.setOnClickListener {
            animator.start()
        }
    }

    companion object {
        const val LAYOUT = R.layout.item_value_animator
    }
}
