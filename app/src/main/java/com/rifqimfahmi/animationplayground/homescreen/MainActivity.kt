package com.rifqimfahmi.animationplayground.homescreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rifqimfahmi.animationplayground.R
import com.rifqimfahmi.animationplayground.homescreen.adapter.ExampleItem
import com.rifqimfahmi.animationplayground.homescreen.adapter.MainAdapter
import com.rifqimfahmi.animationplayground.homescreen.model.Example
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ExampleItem.Listener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupExampleList()
    }

    private fun setupExampleList() {
        with(rv_main) {
            setHasFixedSize(true)
            adapter = MainAdapter(this@MainActivity)
        }
    }

    override fun onExampleItemClick(example: Example) {
        val intent = Intent(this, example.activityClass)
        startActivity(intent)
    }

}
