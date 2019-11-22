package com.example.student_staff_card;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface StudentStaffCard {
    @GET("students")
    Call<List<StudentModel>>getstudents();

    @FormUrlEncoded
    @POST("students")
    Call<ResponseBody>createstudentPost(
            @Field("First_name ") String Firstname,
            @Field("Last_name") String Lastname,
            @Field("Father_name") String Fathername,
            @Field("gender") String gender,
            @Field("adress") String address,
            @Field("contact") String contact

    );

}
