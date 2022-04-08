package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewFlipper VF = findViewById(R.id.view_flipper);
        VF.setInAnimation(MainActivity.this, android.R.anim.fade_in);
        VF.showNext();
        VF.setFlipInterval(5000);
        VF.startFlipping();
    }
}