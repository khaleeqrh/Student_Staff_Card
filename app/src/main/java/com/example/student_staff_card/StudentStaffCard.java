package com.example.student_staff_card;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface StudentStaffCard {
    @GET("students")
    Call<List<StudentModel>>getstudents();

    @POST("students")
    Call<StudentModel>createstudentPost(@Body StudentModel students);

}
