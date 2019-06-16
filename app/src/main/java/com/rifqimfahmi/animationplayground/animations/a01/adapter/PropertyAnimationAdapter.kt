package com.rifqimfahmi.animationplayground.animations.a01.adapter

import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.BaseAdapter
import com.rifqimfahmi.animationplayground.animations.a01.model.PropertyAnimationModels
import com.rifqimfahmi.animationplayground.animations.a00_base.model.Visitable

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

class PropertyAnimationAdapter(typeFactory: PropertyAnimationTypeFactory) :
    BaseAdapter<PropertyAnimationTypeFactory>(typeFactory) {

    override fun initList(): List<Visitable<PropertyAnimationTypeFactory>> {
        return PropertyAnimationModels.create()
    }

}