package com.rifqimfahmi.animationplayground.animations.a01.model

import com.rifqimfahmi.animationplayground.animations.a00_base.model.Visitable
import com.rifqimfahmi.animationplayground.animations.a01.adapter.PropertyAnimationTypeFactory

class ModelObjectAnimator : Visitable<PropertyAnimationTypeFactory> {

    override fun type(typeFactory: PropertyAnimationTypeFactory): Int {
        return typeFactory.type(this)
    }

}