package com.example.us_2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.sawolabs.androidsdk.Sawo;

public class MainActivity extends AppCompatActivity {
//Trying to figure out how things work
    private Handler H = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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