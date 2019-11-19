package com.example.student_staff_card;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.StudentViewHolder> {
    private ArrayList<Studentitem> mStudentList;

public static class StudentViewHolder extends RecyclerView.ViewHolder{

    public ImageView mImageView;
    public TextView mstuname;
    public TextView mstuno;

    LinearLayout linearlayout;
    public StudentViewHolder(@NonNull View itemView) {
        super ( itemView );

        mImageView = itemView.findViewById(R.id.imageView);
        mstuname = itemView.findViewById(R.id.textView);
        mstuno = itemView.findViewById(R.id.textView2);
        linearlayout = itemView.findViewById(R.id.linearlayout);

    }
    }

    public Student_Adapter(ArrayList<Studentitem> studentList) {
        mStudentList = studentList;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_student_item, parent, false);
        StudentViewHolder evh = new StudentViewHolder (v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        final Studentitem currentItem = mStudentList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mstuname.setText(currentItem.getstuname ());
        holder.mstuno.setText(currentItem.getstuno ());
//
//        holder.linearlayout.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent ( currentItem, Student_Detail.class );
//                intent.putExtra (  "image",Studentitem.getIma);
//            }
//        } );
    }

    @Override
    public int getItemCount() {

        return mStudentList.size();
    }
}