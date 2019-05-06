package com.example.dagger2example.di

import com.example.dagger2example.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ScopeOne
@Subcomponent(modules = [ActivityOneModule::class])
interface ActivityOneSubComponent : AndroidInjector<MainActivity>{
    @Subcomponent.Factory
//    abstract class Builder : AndroidInjector.Builder<MainActivity>(){
//        abstract fun myActivityModule(activityOneModule: ActivityOneModule): Builder
//        override fun seedInstance(instance: MainActivity) {
//            myActivityModule(ActivityOneModule(instance))
//        }
//
//        abstract override fun build(): ActivityOneSubComponent

//    }
    interface Factory : AndroidInjector.Factory<MainActivity>
}