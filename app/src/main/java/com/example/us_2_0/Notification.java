package com.example.us_2_0;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Notification extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

    }

    public void ChangeText(View view) {
        final TextView helloTextView = (TextView) findViewById(R.id.textView4);
        helloTextView.setText(R.string.N1);
    }
}