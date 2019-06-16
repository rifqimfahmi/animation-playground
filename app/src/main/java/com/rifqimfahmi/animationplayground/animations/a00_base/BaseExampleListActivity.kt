package com.rifqimfahmi.animationplayground.animations.a00_base

import androidx.recyclerview.widget.RecyclerView
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.animations.a00_base.adapter.decoration.SimpleLineDividerDecoration

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-16.
 */

abstract class BaseExampleListActivity : BaseExampleActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun getLayoutResource(): Int = R.layout.activity_list_example

    override fun setupOnCreate() {
        initView()
        setupRecyclerView()
    }

    private fun initView() {
        recyclerView = findViewById(R.id.rv_example)
    }

    protected fun setupRecyclerView() {
        with(recyclerView) {
            setHasFixedSize(true)
            addItemDecoration(SimpleLineDividerDecoration(this@BaseExampleListActivity))
            addAdapterToRv(this)
        }
    }

    abstract fun addAdapterToRv(recyclerView: RecyclerView)
}