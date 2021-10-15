package com.example.us_2_0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.sawolabs.androidsdk.ConstantsKt;

public class LandingPage extends AppCompatActivity {
    Intent intent = getIntent();
    String message = intent.getStringExtra(ConstantsKt.LOGIN_SUCCESS_MESSAGE);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }
}