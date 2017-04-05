package com.google.firebase.quickstart.database;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Anky An on 5/04/2017.
 * anky25@gmail.com
 */

public class TheApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}