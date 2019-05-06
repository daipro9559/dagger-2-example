package com.example.dagger2example.di

import android.content.Context
import com.example.dagger2example.MainActivity
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityOneModule {

    @Named("StringOne")
    @Provides
    fun stringTest(): String{
        return "String One"
    }

    @Named("StringTwo")
    @Provides
    fun stringTestTwo(): String{
        return "String Two"
    }

    @Provides
    @Named("ActivityContext")
    fun provideContext(activity : MainActivity) : Context{
        return activity
    }
}
