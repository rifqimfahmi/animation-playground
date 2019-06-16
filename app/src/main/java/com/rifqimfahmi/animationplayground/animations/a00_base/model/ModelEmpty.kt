package com.rifqimfahmi.animationplayground.animations.a00_base.model

import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseTypeFactory

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class ModelEmpty : Visitable<BaseTypeFactory> {
    override fun type(typeFactory: BaseTypeFactory): Int {
        return typeFactory.type(this)
    }
}