package com.example.dagger2example.di

import com.example.dagger2example.MainActivity
import com.example.dagger2example.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AndroidInjectionModule::class, AppModule::class, ActivityModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(myApp: MyApp) : Builder
        fun build() : AppComponent
    }
    fun inject(app: MyApp)
}