package com.rifqimfahmi.animationplayground.animations.a01

import androidx.recyclerview.widget.RecyclerView
import com.rifqimfahmi.animationplayground.animations.a00_base.BaseExampleListActivity
import com.rifqimfahmi.animationplayground.animations.a01.adapter.PropertyAnimationAdapter
import com.rifqimfahmi.animationplayground.animations.a01.adapter.PropertyAnimationTypeFactoryImpl

class PropertyAnimationOverview : BaseExampleListActivity() {

    override fun getScreenTitle(): String {
        return TITLE
    }

    override fun addAdapterToRv(recyclerView: RecyclerView) {
        recyclerView.adapter = PropertyAnimationAdapter(PropertyAnimationTypeFactoryImpl())
    }

    override fun getLinkResource(): String {
        return "https://developer.android.com/guide/topics/graphics/prop-animation"
    }

    companion object {
        val TITLE = "Property Animation Overview"
    }
}
