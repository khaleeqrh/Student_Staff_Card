package com.example.student_staff_card;

import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface StudentStaffCard {
    @GET("students")
    Call<List<StudentModel>> getstudents();
    @Multipart
    @POST("students")
    Call<StudentModel> createstudentPost(
            @Part("First_name ") RequestBody Firstname,
            @Part("Last_name") RequestBody Lastname,
            @Part("Father_name") RequestBody Fathername,
            @Part("gender") RequestBody gender,
            @Part("adress") RequestBody address,
            @Part("contact") RequestBody contact

    );


    @Multipart
    @POST("staff")
    Call<StaffModel> createstaffPost(
            @Part("First_name") RequestBody FirstName,
            @Part("Last_Name") RequestBody Lastname,
            @Part("Address") RequestBody address,
            @Part("Department_id") RequestBody Departmetn,
            @Part("Designation_id") RequestBody Designation,
            @Part("gender_id") RequestBody gander

            );

}
