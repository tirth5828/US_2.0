package com.example.us_2_0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.google.android.material.navigation.NavigationView;
import com.sawolabs.androidsdk.Sawo;

public class MainActivity extends AppCompatActivity {


    private Handler H = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("onlyonce", false);
        editor.commit();

    }

    public void Log(View view) {
        H.postDelayed(SAWO,5000);
    }

    private Runnable SAWO = new Runnable() {
        @Override
        public void run() {
            new Sawo(
                    MainActivity.this,
                    "1014c134-e723-43fe-a4d5-5933c554bf29", // your api key
                    "616975ed3148f7167607f1226AeBwjDLRISfuqNqGz6NqBS4"  // your api key secret
            ).login(
                    "email", // can be one of 'email' or 'phone_number_sms'
                    LandingPage.class.getName()  // Callback class name
            );
        }
    };

}