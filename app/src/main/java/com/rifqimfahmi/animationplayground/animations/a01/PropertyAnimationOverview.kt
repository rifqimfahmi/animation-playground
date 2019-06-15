package com.rifqimfahmi.animationplayground.animations.a01

import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.BaseExampleActivity

class PropertyAnimationOverview : BaseExampleActivity() {

    override fun getLayoutResource(): Int {
        return R.layout.activity_property_animation_overview
    }

    override fun getScreenTitle(): String {
        return TITLE
    }

    override fun setupOnCreate() {

    }

    override fun getLinkResource(): String {
        return "https://developer.android.com/guide/topics/graphics/prop-animation"
    }

    companion object {
        val TITLE = "Property Animation Overview"
    }
}
