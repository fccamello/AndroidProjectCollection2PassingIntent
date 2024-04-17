package com.example.androidprojectcollection2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PassingIntentsExercise extends AppCompatActivity {

    Button submit, clear;
    RadioButton female, male, others, cs, it;
    TextView eFName, eLName, eBDate, ePhoneNumber, eAddress, eEmailAdd, eIDNumber, eYear, eDept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        eFName = (TextView) findViewById(R.id.eFName);
        eLName = (TextView) findViewById(R.id.eLName);
        eBDate = (TextView) findViewById(R.id.eBDate);
        ePhoneNumber = (TextView) findViewById(R.id.ePNumber);
        eAddress = (TextView) findViewById(R.id.eAddress);
        eEmailAdd = (TextView) findViewById(R.id.eEmailAdd);
        eIDNumber = (TextView) findViewById(R.id.eIDNumber);
        eYear = (TextView) findViewById(R.id.eYearLevel);
        eDept = (TextView) findViewById(R.id.eDept);

        male = (RadioButton) findViewById(R.id.btnMale);
        female = (RadioButton) findViewById(R.id.btnFemale);
        others = (RadioButton) findViewById(R.id.btnOthers);

        cs = (RadioButton) findViewById(R.id.rbCS);
        it = (RadioButton) findViewById(R.id.rbIT);


        submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = eFName.getText().toString();
                String LName = eLName.getText().toString();
                String id = eIDNumber.getText().toString();
                String BDate = eBDate.getText().toString();
                String PNumber = ePhoneNumber.getText().toString();
                String Address = eAddress.getText().toString();
                String emailAdd = eEmailAdd.getText().toString();
                String yearLevel = eYear.getText().toString();
                String department = eDept.getText().toString();

                String gender;
                if (male.isChecked()){
                    gender = "Male";
                }
                else if (female.isChecked()){
                    gender = "Female";
                }
                else if (others.isChecked()){
                    gender = "Others";
                }
                else{
                    gender = "Unknown";
                }

                String course;
                if (cs.isChecked()){
                    course = "Computer Science";
                }
                else if (it.isChecked()){
                    course = "Information Technology";
                }
                else{
                    course = "Unknown";
                }

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fName_key", fName);
                intent.putExtra("LName_key", LName);
                intent.putExtra("BDate_key", BDate);
                intent.putExtra("PNumber_key", PNumber);
                intent.putExtra("Address_key", Address);
                intent.putExtra("idnum_key", id);
                intent.putExtra("emailAdd_key", emailAdd);
                intent.putExtra("yearLevel_key", yearLevel);
                intent.putExtra("department_key", department);
                intent.putExtra("gender_key", gender);
                intent.putExtra("course_key", course);

                startActivity(intent);
            }



        });

        clear = (Button) findViewById(R.id.btnClear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eFName.setText(" ");
                eLName.setText(" ");
                eBDate.setText(" ");
                ePhoneNumber.setText(" ");
                eAddress.setText(" ");
                eEmailAdd.setText(" ");
                eIDNumber.setText(" ");
                eYear.setText(" ");
                eDept.setText(" ");

                if (male.isChecked()){
                 male.setChecked(false);
                }

                if (female.isChecked()){
                    female.setChecked(false);
                }

                if (others.isChecked()){
                   others.setChecked(false);
                }

                if (cs.isChecked()){
                   cs.setChecked(false);
                }

                if (it.isChecked()){
                    it.setChecked(false);
                }
            }
        });

    }



}