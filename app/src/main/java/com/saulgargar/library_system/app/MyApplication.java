package com.saulgargar.library_system.app;

import android.app.Application;
import android.content.Context;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());

        setUpRealmConfig();

    }

    private void setUpRealmConfig(){
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .build();
        Realm.setDefaultConfiguration(config);
    }

}
