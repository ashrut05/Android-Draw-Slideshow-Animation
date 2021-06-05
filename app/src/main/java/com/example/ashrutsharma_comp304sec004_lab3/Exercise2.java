package com.example.ashrutsharma_comp304sec004_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise2 extends AppCompatActivity {

    private AnimationDrawable _frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        findViewById(R.id.bStart).setOnClickListener(v -> startAnimation());
        findViewById(R.id.bStop).setOnClickListener(v -> stopAnimation());
    }

    private void startAnimation() {
        Drawable[] frames = new Drawable[4];
        frames[0] = getDrawable(R.drawable.frame01);
        frames[1] = getDrawable(R.drawable.frame02);
        frames[2] = getDrawable(R.drawable.frame03);
        frames[3] = getDrawable(R.drawable.frame04);

        _frameAnimation = new AnimationDrawable();
        _frameAnimation.setOneShot(false); // loop continuously
        for (Drawable frame : frames) {
            int randomDuration = ThreadLocalRandom.current().nextInt(100, 500 + 1);
            _frameAnimation.addFrame(frame, randomDuration);
        }

        ImageView img = findViewById(R.id.ivAnimation);
        img.setBackgroundDrawable(_frameAnimation);

        _frameAnimation.start();
    }

    private void stopAnimation() {
        _frameAnimation.stop();
    }
}