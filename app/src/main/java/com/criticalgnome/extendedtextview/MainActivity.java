package com.criticalgnome.extendedtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.criticalgnome.exttextview.ExtTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExtTextView extTextView = findViewById(R.id.extTextView);
        extTextView.setMainText("Hello, World!");
        extTextView.setAdditionalText("From my library");
    }
}
