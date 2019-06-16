package com.rifqimfahmi.animationplayground.animations.a00_base.adapter

import android.view.View
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.viewholder.ItemEmpty
import com.rifqimfahmi.animationplayground.animations.a00_base.model.ModelEmpty

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

open class BaseTypeFactoryImpl : BaseTypeFactory {

    override fun type(modelEmptyItem: ModelEmpty): Int {
        return ItemEmpty.LAYOUT
    }

    override fun create(view: View, viewType: Int): BaseViewHolder<*> {
        return ItemEmpty(view)
    }

}