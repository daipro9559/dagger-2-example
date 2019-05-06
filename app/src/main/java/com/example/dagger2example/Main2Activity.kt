package com.example.dagger2example

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection

import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main2.*
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {
    @Inject
    lateinit var myTool: MyTool
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
        txt2.text = myTool.squareValue(10).toString()
    }

}
