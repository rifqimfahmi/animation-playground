package com.rifqimfahmi.animationplayground.animations

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.rifqimfahmi.animationplayground.R

/*
 * Created by Rifqi Mulya Fahmi on 2019-06-15.
 */

abstract class BaseExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResource())
        setupToolbar()
        setupOnCreate()
    }

    @LayoutRes
    abstract fun getLayoutResource(): Int

    private fun setupToolbar() {
        title = getScreenTitle()
        supportActionBar?.let {
            with(it) {
                setDisplayHomeAsUpEnabled(true)
                setDisplayShowHomeEnabled(true)
            }
        }
    }

    abstract fun getScreenTitle(): String

    abstract fun setupOnCreate()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.base_example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.open_in_new_tab -> openSourceInBrowser()
            android.R.id.home -> finishCurrentActivity()
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openSourceInBrowser(): Boolean {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(getLinkResource()))
        startActivity(intent)
        return true
    }

    private fun finishCurrentActivity(): Boolean {
        finish()
        return true
    }

    abstract fun getLinkResource(): String


}