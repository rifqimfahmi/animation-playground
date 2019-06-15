package com.rifqimfahmi.animationplayground.animations

import com.rifqimfahmi.animationplayground.R

class A01_PropertyAnimationOverview : BaseExampleActivity() {

    override fun getLayoutResource(): Int {
        return R.layout.activity_a01__property_animation_overview
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
