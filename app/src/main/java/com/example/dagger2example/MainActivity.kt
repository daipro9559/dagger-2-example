package com.example.dagger2example

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @field:Named("StringTwo")
    lateinit var text :String

    @Inject
    @field:Named("ActivityContext")
    lateinit var contextActivtiy : Context
    @Inject
    @field:Named("ContextApp")
    lateinit var contextApp : Context

    @Inject
    lateinit var myTool: MyTool
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt.text = contextActivtiy.getString(R.string.app_name)
        btn.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }
        Log.e("debug ", contextActivtiy.toString())
        Log.e("debug ", contextApp.toString())
    }
}
