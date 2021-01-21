package com.example.newapp.di;


import com.example.newapp.application.CustomApplication;
import com.example.newapp.di.component.AppComponent;
import com.example.newapp.di.component.ViewModelComponent;

public class Injector {
    public static AppComponent get() {
        return CustomApplication.get().getAppComponent();
    }

    public static ViewModelComponent getViewModelComponent() {
        return CustomApplication.get().getViewModelComponent();
    }
}
