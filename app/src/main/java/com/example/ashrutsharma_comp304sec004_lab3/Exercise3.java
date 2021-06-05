package com.example.ashrutsharma_comp304sec004_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Exercise3 extends AppCompatActivity {
    private ImageView moonImg;
    private Animation orbit;
    private Animation orbitstop;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_exercise3);
            moonImg = (ImageView) findViewById(R.id.moon);

            Button btnStart = (Button) findViewById(R.id.btnStart);
            orbit = AnimationUtils.loadAnimation(this, R.anim.orbit);
            btnStart.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    orbit.setRepeatCount(Animation.INFINITE);
                    moonImg.startAnimation(orbit);
                }
            });

            Button btnStop = (Button) findViewById(R.id.btnStop);
            orbitstop = AnimationUtils.loadAnimation(this, R.anim.orbitstop);
            btnStart.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    moonImg.startAnimation(orbitstop);
                }
            });

        }
}