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

public class activity_button_exercise extends AppCompatActivity {

    ConstraintLayout mainLayout;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btn2 = (Button) findViewById(R.id.btnToast);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_button_exercise.this, "This is a toast", Toast.LENGTH_SHORT).show();
            }
        });

        mainLayout = findViewById(R.id.rlVar1);


        btn3 = (Button) findViewById(R.id.btn_changebg);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                mainLayout.setBackgroundColor(color);            }
        });

        btn4 = (Button) findViewById(R.id.btn_changebtn);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                btn4.setBackgroundColor(color);
            }
        });


        btn5 = (Button) findViewById(R.id.btnDisappear);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setVisibility(view.INVISIBLE);
            }
        });

        btn6 = (Button) findViewById(R.id.btnClose);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(
                        activity_button_exercise.this, ReturnActivity.class);
                startActivity(intent2);
            }
        });
    }


}
