package com.example.dagger2example

import com.example.dagger2example.di.ScopeOne
import com.example.dagger2example.di.ScopeTwo
import javax.inject.Inject
import javax.inject.Singleton

class MyTool {

    @Inject
    constructor()

    public fun squareValue(value: Int) = value * value
}