package com.rifqimfahmi.animationplayground.animations.a01.adapter

import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseTypeFactory
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelObjectAnimator
import com.rifqimfahmi.animationplayground.animations.a01.model.ModelValueAnimator

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */
 
interface PropertyAnimationTypeFactory:
    BaseTypeFactory {
    fun type(modelValueAnimator: ModelValueAnimator): Int
    fun type(modelObjectAnimator: ModelObjectAnimator): Int
}