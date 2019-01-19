package com.saiefalemon.whatsappdemo;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;

public class StarterApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("u8Gi1zm7TC8NlPw5VRzdcMV8w45U66v9ukFGGSPZ")
                .clientKey("CQSFvgThFIrgH3qbs9Kn4r0aWd2uCmlabHC2LdsC")
                .server("https://parseapi.back4app.com/")
                .build()
        );



        //ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}
