package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Screen extends AppCompatActivity {


    public Button student,staff,admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main__screen );

        student= findViewById ( R.id.student );

        staff= findViewById ( R.id.staff );


        admin= findViewById ( R.id.admin );


        student.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent ( getApplicationContext (), Student_Reg.class );
                        startActivity ( i );

                    }
                } );

        staff.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent ( getApplicationContext (), Staff_Reg.class );
                        startActivity ( i );

                    }
                } );


        admin.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent ( getApplicationContext (), Login.class );
                        startActivity ( i );

                    }
                } );

    }
}
