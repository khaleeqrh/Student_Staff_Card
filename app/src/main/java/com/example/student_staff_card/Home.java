package com.example.student_staff_card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_home );

        ArrayList<Studentitem> studentitemsList = new ArrayList<> ();

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


        mRecyclerView = findViewById(R.id.studentrecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager (this);
        mAdapter = new Student_Adapter ( studentitemsList );

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
