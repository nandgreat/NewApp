package com.example.newapp.di.component;


import com.example.newapp.application.MainActivity;
import com.example.newapp.di.module.ViewModelModule;

import dagger.Subcomponent;

@Subcomponent(modules = ViewModelModule.class)
public interface ViewModelComponent {
    void inject(MainActivity activity);
}
