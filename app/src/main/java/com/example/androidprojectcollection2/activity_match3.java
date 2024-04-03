package com.example.androidprojectcollection2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class activity_match3 extends AppCompatActivity {


    Integer[] colors = new Integer[]{Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE};
//    int [][] position = new int[][]{ {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},};
    Button[][] buttons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        buttons = new Button[][]{
                {findViewById(R.id.matchbtn1), findViewById(R.id.matchbtn2), findViewById(R.id.matchbtn3), findViewById(R.id.matchbtn4), findViewById(R.id.matchbtn5)},
                {findViewById(R.id.matchbtn7), findViewById(R.id.matchbtn7), findViewById(R.id.matchbtn8), findViewById(R.id.matchbtn9), findViewById(R.id.matchbtn10)},
                {findViewById(R.id.matchbtn11), findViewById(R.id.matchbtn12), findViewById(R.id.matchbtn13), findViewById(R.id.matchbtn14), findViewById(R.id.matchbtn15)},
                {findViewById(R.id.matchbtn16), findViewById(R.id.matchbtn17), findViewById(R.id.matchbtn18), findViewById(R.id.matchbtn19), findViewById(R.id.matchbtn20)},
                        {findViewById(R.id.matchbtn21), findViewById(R.id.matchbtn22), findViewById(R.id.matchbtn23), findViewById(R.id.matchbtn24), findViewById(R.id.matchbtn25)}
            };


        randomize();

//        for (int a = 0; a < 4; a++) {
//            for (int b = 0; b<4; b++){
//                int value = position[a][b];
//                int color = value;
//
//        }
//    }
//
}

    void randomize(){
        Random ran = new Random();
        for (int a =0; a<5; a++){
            for (int b =0; b<5; b++){
                int temp = ran.nextInt(4);
                buttons[a][b].setBackgroundColor(colors[temp]);
            }
        }
    }

}