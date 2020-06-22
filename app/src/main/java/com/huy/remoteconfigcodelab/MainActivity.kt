package com.huy.remoteconfigcodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRemoteConfig()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.refresh_config -> {
                fetchConfig()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initRemoteConfig() {

        // TODO: set up Remote Config service

        fetchConfig()
    }

    private fun fetchConfig() {
        // TODO: fetch and apply Remote Config parameters

    }
}