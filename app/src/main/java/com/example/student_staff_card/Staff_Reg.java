package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Staff_Reg extends AppCompatActivity {
    Button register;
    EditText frstnam, lastname, address, contact;
    RadioGroup rggender;
    RadioButton rdmale, rdfemale;
    Spinner spdepartment,spdesignation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_staff__reg );

        frstnam=findViewById(R.id.fname);
        lastname=findViewById(R.id.lname);
        rdmale=findViewById(R.id.radioM);
        rdfemale=findViewById(R.id.radioF);
        spdepartment=findViewById(R.id.dprtmentspinner);
        spdesignation=findViewById(R.id.designationspinner);
        register=findViewById(R.id.buttonstaffreg);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender = "Male";

                int radid = rggender.getCheckedRadioButtonId();
                if (radid == 0) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }






















               /* Call<ResponseBody> call= RetrofitClient.getInstance().getApi().createstaffPost(frstnam.getText().toString(),
                        lastname.getText().toString(),
                        address.getText().toString(), spdepartment.getSelectedItem().toString(),spdesignation.getSelectedItem().toString(),gender);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });*/
            }
        });



    }
}
