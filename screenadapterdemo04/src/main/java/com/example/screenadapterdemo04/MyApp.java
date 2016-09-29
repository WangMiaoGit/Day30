package com.example.screenadapterdemo04;

import android.app.Application;

/**
 * Created by wangmiao on 2016/9/29.
 */
public class MyApp extends Application {
    private String name;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
