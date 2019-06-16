package com.rifqimfahmi.animationplayground.homescreen.model

import com.rifqimfahmi.animationplayground.animations.a01.PropertyAnimationOverview

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-16.
 */

object ExampleModelCreator {
    fun create(): List<Example> = arrayListOf(
        Example(PropertyAnimationOverview.TITLE, PropertyAnimationOverview::class.java)
    )
}