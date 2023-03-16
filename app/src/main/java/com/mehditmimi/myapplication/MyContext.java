package com.mehditmimi.myapplication;

import android.app.Application;

import com.mehditmimi.myapplication.businsess.DefaultService;
import com.mehditmimi.myapplication.businsess.Services;
import com.mehditmimi.myapplication.dao.UserDaoMemory;

public class MyContext extends Application {
    private Services services;

    @Override
    public void onCreate() {
        super.onCreate();
        services = new DefaultService(new UserDaoMemory());
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
