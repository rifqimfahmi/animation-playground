package com.rifqimfahmi.animationplayground.animations.a01.adapter

import android.view.View
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseTypeFactoryImpl
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseViewHolder
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelObjectAnimator
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelValueAnimator
import com.rifqimfahmi.animationplayground.animations.a01.viewholder.ItemObjectAnimator
import com.rifqimfahmi.animationplayground.animations.a01.viewholder.ItemValueAnimator

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class PropertyAnimationTypeFactoryImpl : BaseTypeFactoryImpl(), PropertyAnimationTypeFactory {

    override fun type(modelValueAnimator: ModelValueAnimator): Int {
        return ItemValueAnimator.LAYOUT
    }

    override fun type(modelObjectAnimator: ModelObjectAnimator): Int {
        return ItemObjectAnimator.LAYOUT
    }

    override fun create(view: View, viewType: Int): BaseViewHolder<*> {
        return when (viewType) {
            ItemValueAnimator.LAYOUT -> ItemValueAnimator(view)
            ItemObjectAnimator.LAYOUT -> ItemObjectAnimator(view)
            else -> super.create(view, viewType)
        }
    }

}