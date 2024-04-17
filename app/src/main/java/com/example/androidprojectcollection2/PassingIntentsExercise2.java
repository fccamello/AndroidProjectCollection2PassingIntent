package com.example.androidprojectcollection2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFname, tLname, tgender, tbday, tphonenum, temailadd, taddress, tidnum, tcourse, tdept, tyear;
    Button btreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tFname = findViewById(R.id.txtPl2Fname);
        tLname = findViewById(R.id.txtPl2Lname);
        tgender = findViewById(R.id.txtPl2Gender);
        tbday = findViewById(R.id.txtPl2Bdate);
        tphonenum = findViewById(R.id.txtPl2PhoneNumber);
        temailadd = findViewById(R.id.txtPl2EmailAdd);
        taddress = findViewById(R.id.txtPl2Address);
        tidnum = findViewById(R.id.txtPl2IdNum);
        tcourse = findViewById(R.id.txtPl2Course);
        tdept = findViewById(R.id.txtPl2Dept);
        tyear = findViewById(R.id.txtPl2YearLevel);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fName_key");
        String id = intent.getStringExtra("idnum_key");
        String lname = intent.getStringExtra("LName_key");
        String gender = intent.getStringExtra("gender_key");
        String bday = intent.getStringExtra("BDate_key");
        String pnum = intent.getStringExtra("PNumber_key");
        String add = intent.getStringExtra("Address_key");
        String yr = intent.getStringExtra("yearLevel_key");
        String email = intent.getStringExtra("emailAdd_key");
        String dept = intent.getStringExtra("department_key");
        String course = intent.getStringExtra("course_key");


        tFname.setText(fname);
        tgender.setText(gender);
        tLname.setText(lname);
        tbday.setText(bday);
        tphonenum.setText(pnum);
        taddress.setText(add);
        temailadd.setText(email);
        tyear.setText(yr);
        tdept.setText(dept);
        tidnum.setText(id);
        tcourse.setText(course);

       btreturn = (Button) findViewById(R.id.btnReturnButton2);

       btreturn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent2 = new Intent(PassingIntentsExercise2.this, PassingIntentsExercise.class);
               startActivity(intent2);
           }
       });



    }
}