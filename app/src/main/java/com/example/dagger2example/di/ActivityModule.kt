package com.example.dagger2example.di

import android.support.v4.app.ActivityCompat
import com.example.dagger2example.Main2Activity
import com.example.dagger2example.MainActivity

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module(subcomponents = [ActivityOneSubComponent::class, ActivityTwoSubComponent::class])
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    internal abstract fun bindActivityOneInjectorFactory(factory: ActivityOneSubComponent.Factory): AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(Main2Activity::class)
    internal abstract fun bindActivityTwoInjectorFactory(factory: ActivityTwoSubComponent.Factory): AndroidInjector.Factory<*>

}
