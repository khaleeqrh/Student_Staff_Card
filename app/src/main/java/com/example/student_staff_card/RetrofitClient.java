package com.example.student_staff_card;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
     private static final String Base_Url="192.168.137.1:8080/api";
     private static RetrofitClient instance;
     private Retrofit retrofit;
     private RetrofitClient(){
         retrofit=new Retrofit.Builder().baseUrl("192.168.137.1:8080/api").addConverterFactory(GsonConverterFactory.create()).build();
     }
     public static synchronized RetrofitClient getInstance(){
         if(instance == null){
             instance=new RetrofitClient();
         }
         return instance;
     }
     public StudentStaffCard getApi(){
         return retrofit.create(StudentStaffCard.class);
     }
}
