package com.example.newapp.di.component;


import com.example.newapp.di.module.AppModule;
import com.example.newapp.di.module.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        AppModule.class})
@Singleton
public interface AppComponent  {
    ViewModelComponent viewModelComponent(ViewModelModule viewModelModule);
}