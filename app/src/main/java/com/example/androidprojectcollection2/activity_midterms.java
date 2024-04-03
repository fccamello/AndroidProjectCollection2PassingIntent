package com.example.androidprojectcollection2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_midterms extends AppCompatActivity {

    Button[][] buttons;
    Button restart;
    TextView turn;
    Toast toast;
    boolean win = false;
    View view;
    boolean player1 = true;
    char [][] tiles = new char[][]
            {
                    {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midterms);


        restart = findViewById(R.id.btnRestart);

        buttons = new Button[][]{
                {findViewById(R.id.btn1), findViewById(R.id.btn2), findViewById(R.id.btn3)},
                {findViewById(R.id.btn4), findViewById(R.id.btn5), findViewById(R.id.btn6)},
                {findViewById(R.id.btn7), findViewById(R.id.btn8), findViewById(R.id.btn9)}
        };

        for (int a=0; a<3; a++){
            for (int b=0; b<3; b++){
                buttons[a][b].setBackgroundColor(Color.WHITE);
            }
        }


        for (int a =0; a<3; a++){
            for (int b=0; b<3; b++){
                int row = a;
                int column = b;
                buttons[row][column].setOnClickListener(new View.OnClickListener() {
                    int r = row;
                    int c = column;
                    @Override
                    public void onClick(View view) {
                        if (tiles[r][c] == ' '){
                            if(player1){
                                tiles[r][c] = 'O';
//
                            }

                            else{
                                tiles[r][c] = 'X';
//                                buttons[row][column].setText('X');

                            }
                        }

                        setMark();
                        player1 = !player1;
                        setDisplay();

                        if (tiles[0][1] == (tiles[1][1]) && tiles[0][1] == tiles[2][1] && tiles[0][1] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            buttons[0][0].setBackgroundColor(Color.GRAY);
                            buttons[0][0].setClickable(false);
                            buttons[1][0].setClickable(false);
                            buttons[2][0].setClickable(false);
                            buttons[0][1].setClickable(false);
                            buttons[1][0].setClickable(false);
                        }

                        if (tiles[0][0] == (tiles[1][0]) && tiles[0][0] == tiles[2][0] && tiles[0][0] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();

                        }

                        if (tiles[0][2] == (tiles[1][2]) && tiles[0][2] == tiles[2][2] && tiles[0][2] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;
                        }

                        if (tiles[0][0] == (tiles[0][1]) && tiles[0][0] == tiles[0][2] && tiles[0][0] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;
                        }

                        if (tiles[1][0] == (tiles[1][1]) && tiles[1][0] == tiles[1][2] && tiles[1][0] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;
                        }

                        if (tiles[2][0] == (tiles[2][1]) && tiles[2][0] == tiles[2][2] && tiles[2][0] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;
                        }

                        if (tiles[0][0] == (tiles[1][1]) && tiles[0][0] == tiles[2][2] && tiles[0][0] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;
                        }

                        if (tiles[2][2] == (tiles[1][1]) && tiles[2][2] == tiles[0][2] && tiles[0][2] != ' ')
                        {
                            toast.makeText(getApplicationContext(), "YOU WIN" , Toast.LENGTH_SHORT).show();
                            win = true;


                        }


                    }

                });

            }
        }
        setMark();

//

        setDisplay();

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1 = true;
                setMark();
                for (int a=0; a<3; a++){
                    for (int b=0; b<3; b++){
                        tiles[a][b] = ' ';
                    }
                }
                setDisplay();
                setMark();

            }
        });

    }

    void setMark(){
        for (int a =0; a<3; a++){
            for (int b = 0; b<3; b++){
                char mark = tiles[a][b];
                buttons[a][b].setText("" + mark);
            }
        }
    }

    void setDisplay()
    {
        turn = findViewById(R.id.txtView);
        view = findViewById(R.id.background);
        if (player1){
            turn.setText("Player O's Turn");
            view.setBackgroundColor(Color.BLUE);
        }
        else{
            turn.setText("Player X's Turn");
            view.setBackgroundColor(Color.RED);
        }
    }
}