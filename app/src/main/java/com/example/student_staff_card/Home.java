package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<Studentitem> studentitemsList = new ArrayList<>();

        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Saeed Khan", "03215618418"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Ali Ahmed", "03024854795"));
        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Ahmed Rizwan", "03005821485"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Hassan Ali", "03028854795"));
        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Saad Khan", "03215618418"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Ali Ahmed", "03024854795"));
        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Saeed Khan", "03215618418"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Ali Ahmed", "03024854795"));
        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Ahmed Rizwan", "03005821485"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Hassan Ali", "03028854795"));

        studentitemsList.add(new Studentitem (R.drawable.ic_studentreg, "Ahmed Rizwan", "03005821485"));
        studentitemsList.add(new Studentitem (R.drawable.ic_teacherreg, "Hassan Khan", "03028854795"));


       /* Retrofit retrofit = new Retrofit.Builder().baseUrl("192.168.137.1:8080/api").addConverterFactory(GsonConverterFactory.create()).build();
        StudentStaffCard studentStaffCard = retrofit.create(StudentStaffCard.class);
        Call<List<StudentModel>> call = studentStaffCard.getstudents();
        call.enqueue(new Callback<List<StudentModel>>() {
            @Override
            public void onResponse(Call<List<StudentModel>> call, Response<List<StudentModel>> response) {

            }

            @Override
            public void onFailure(Call<List<StudentModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage().toString(), Toast.LENGTH_SHORT).show();
            }
        });*/


        mRecyclerView = findViewById(R.id.studentrecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Student_Adapter(studentitemsList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
