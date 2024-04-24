package com.example.androidprojectcollection2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class activity_Menus extends AppCompatActivity {

    Button btnChange;
    Random rnd = new Random();

    int [] strings = {
            R.string.t1,
            R.string.t2,
            R.string.t3,
            R.string.t4,
            R.string.t5,
            R.string.t6,
            R.string.t7,
            R.string.t8,
            R.string.t9,
            R.string.t10,
            R.string.t11,
            R.string.t12,
            R.string.t13,
            R.string.t14
    };



    public void Reset(){
        btnChange.setBackgroundColor(Color.YELLOW);
        btnChange.setTextColor(Color.BLACK);
        btnChange.setWidth(1000);
        btnChange.setHeight(1000);
        btnChange.setText("HELLO!");
        btnChange.setRotationX(0);
        btnChange.setRotationY(0);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        btnChange = findViewById(R.id.btnChange);
        Reset();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_exercise,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.mItemChange){
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        }

         if (item.getItemId() == R.id.mChangeColor){
            Toast.makeText(this, "Change Button Color (Random)", Toast.LENGTH_SHORT).show();
             int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
             btnChange.setBackgroundColor(color);
        }

         if (item.getItemId() == R.id.mChangeText){
             int temp = rnd.nextInt(14);
            Toast.makeText(this, "Change Button Number is clicked", Toast.LENGTH_SHORT).show();
            btnChange.setText(strings[temp]);
        }

         if (item.getItemId() == R.id.mCShape){
            Toast.makeText(this, "Change Text Color is clicked", Toast.LENGTH_SHORT).show();
             int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
             btnChange.setTextColor(color);
        }

         if (item.getItemId() == R.id.mCPosition){
            Toast.makeText(this, "Change Button Rotation is clicked", Toast.LENGTH_SHORT).show();
            btnChange.setRotationX(100);
             btnChange.setRotationY(200);
         }

        if (item.getItemId() == R.id.mCSize){
            Toast.makeText(this, "Change Button Size is clicked", Toast.LENGTH_SHORT).show();
            btnChange.setWidth(200);
            btnChange.setHeight(100);
        }


        if (item.getItemId() == R.id.mItemReset){
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
            Reset();

        }

         if (item.getItemId() == R.id.mItemExit){
            finish();
        }

        return true;
    }


}