package com.mycompany.homework7amikegardner;

/**
 * Created by Michael on 11/8/2015.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, ApplicationID, ClientKey); // Your Application ID and Client Key are defined elsewhere
    }
}

