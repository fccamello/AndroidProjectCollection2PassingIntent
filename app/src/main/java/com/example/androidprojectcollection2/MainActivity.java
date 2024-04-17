package com.example.androidprojectcollection2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4, btn5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn_LayoutExercise);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ActivityLayoutExercise.class);
                startActivity(intent1);

            }
        });

        btn2 = (Button) findViewById(R.id.btnButtonEx);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, activity_button_exercise.class);
                startActivity(intent2);
            }
        });

        btn4 = (Button) findViewById(R.id.btnMatch);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, activity_match3.class);
                startActivity(intent3);
            }
        });

        btn5 = (Button) findViewById(R.id.btnPassingIntent);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent4);
            }
        });

    }
}