package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class Student_Reg extends AppCompatActivity {
    Button Login;
    RadioButton rdmale, rdfemale;
    EditText firstname, lastname, contactnum, fathername, address;
    RadioGroup rggender;
    private StudentStaffCard studentStaffCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__reg);
        Login = findViewById(R.id.buttonregister);
        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        rdmale = findViewById(R.id.radioM);
        rdfemale = findViewById(R.id.radioF);
        contactnum = findViewById(R.id.contact);
        fathername = findViewById(R.id.fathername);
        address = findViewById(R.id.address);
        rggender = findViewById(R.id.radioGrp);
        Retrofit retrofit = new Retrofit.Builder().baseUrl("192.168.137.1:8080/api").addConverterFactory(GsonConverterFactory.create()).build();
        studentStaffCard = retrofit.create(StudentStaffCard.class);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = "Male";

                int radid = rggender.getCheckedRadioButtonId();
                if (radid == 0) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                addstudent(firstname.getText().toString(), lastname.getText().toString(), fathername.getText().toString(), "12", gender, address.getText().toString(), contactnum.getText().toString());
            }


        });

    }

    // public StudentModel(String firstName, String lastName, String fatherName, String regNo, String gender, String adress, String contact) {
    private void addstudent(String Firstname, String Last_name, String FatherName, String Regno, String Gender, String Address, String Contact) {
        StudentModel post = new StudentModel(Firstname, Last_name, FatherName, Regno, Gender, Address, Contact);

        Call<StudentModel> call = studentStaffCard.createstudentPost(post);
        call.enqueue(new Callback<StudentModel>() {
            @Override
            public void onResponse(Call<StudentModel> call, Response<StudentModel> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), response.code(), Toast.LENGTH_SHORT).show();
                }
                StudentModel student= response.body();
            }

            @Override
            public void onFailure(Call<StudentModel> call, Throwable t) {

            }
        });
    }
}
