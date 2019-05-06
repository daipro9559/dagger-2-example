package com.example.dagger2example.di

import com.example.dagger2example.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Named("ContextApp")
    @Provides
    fun applicationContext(myApp: MyApp) = myApp.applicationContext

}