package com.example.dagger2example.di

import com.example.dagger2example.Main2Activity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ScopeTwo
@Subcomponent(modules = [ActivityTwoModule::class])
interface ActivityTwoSubComponent: AndroidInjector<Main2Activity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<Main2Activity>
}