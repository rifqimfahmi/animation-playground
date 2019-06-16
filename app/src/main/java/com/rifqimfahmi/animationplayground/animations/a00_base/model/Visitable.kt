package com.rifqimfahmi.animationplayground.animations.a00_base.model

import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseTypeFactory

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

interface Visitable<in T : BaseTypeFactory> {
    fun type(typeFactory: T): Int
}