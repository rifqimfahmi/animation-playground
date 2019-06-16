package com.rifqimfahmi.animationplayground.animations.a00_base.adapter

import android.view.View
import com.rifqimfahmi.animationplayground.animations.a00_base.model.ModelEmpty

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

interface BaseTypeFactory {

    fun type(modelEmptyItem: ModelEmpty): Int

    fun create(view: View, viewType: Int): BaseViewHolder<*>

}