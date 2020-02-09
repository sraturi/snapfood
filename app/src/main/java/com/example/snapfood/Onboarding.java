package com.example.snapfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Onboarding extends AppCompatActivity {
    private ImageButton StartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        StartButton = (ImageButton) findViewById(R.id.imageButton);
        StartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Onboarding.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
