package com.rifqimfahmi.animationplayground.model

import com.rifqimfahmi.animationplayground.animations.BaseExampleActivity

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

data class Example(
    val title: String,
    val activityClass: Class<out BaseExampleActivity>
)