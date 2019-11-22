package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.ResponseBody;
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
                Call<ResponseBody> call= RetrofitClient.getInstance().getApi().createstudentPost(firstname.getText().toString(),
                        lastname.getText().toString(),
                        fathername.getText().toString(), gender,
                        address.getText().toString(), contactnum.getText().toString());
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        String resp=response.body().toString();
                        Toast.makeText(getApplicationContext(),resp.toString(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }


        });

    }


}
