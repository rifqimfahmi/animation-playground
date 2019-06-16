package com.rifqimfahmi.animationplayground.animations.a01.model

import com.rifqimfahmi.animationplayground.animations.a01.adapter.PropertyAnimationTypeFactory
import com.rifqimfahmi.animationplayground.animations.a00_base.model.Visitable

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class ModelValueAnimator :
    Visitable<PropertyAnimationTypeFactory> {

    override fun type(typeFactory: PropertyAnimationTypeFactory): Int {
        return typeFactory.type(this)
    }

}