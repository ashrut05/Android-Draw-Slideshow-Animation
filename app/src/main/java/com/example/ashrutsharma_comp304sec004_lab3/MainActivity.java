package com.example.ashrutsharma_comp304sec004_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Button variables for all menu options
    private Button btnExercise1;
    private Button btnExercise2;
    private Button btnExercise3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExercise1 = (Button) findViewById(R.id.btnExercise1);
        btnExercise1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openExercise1();
            } //Methods for opening an activity for each button
        });

        btnExercise2 = (Button) findViewById(R.id.btnExercise2);
        btnExercise2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openExercise2();
            } //Methods for opening an activity for each button
        });

        btnExercise3 = (Button) findViewById(R.id.btnExercise3);
        btnExercise3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openExercise3();
            } //Methods for opening an activity for each button
        });
    }

    //Methods for opening different activity called based on which option is selcted in the menu or which button is pressed on the menu page
    public void openExercise1() {
        Toast.makeText(this, "Exercise 1 Selected",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Exercise1.class);
        startActivity(intent);
    }

    public void openExercise2() {
        Toast.makeText(this, "Exercise 2 Selected",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Exercise2.class);
        startActivity(intent);
    }

    public void openExercise3() {
        Toast.makeText(this, "Exercise 3 Selected",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Exercise3.class);
        startActivity(intent);
    }
}