package com.example.student_staff_card;


import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static final String Base_Url="http://192.168.137.1:8080/api/";
    public static StudentStaffCard ApiCalls(Context context) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient().newBuilder().readTimeout(17, TimeUnit.SECONDS)
                .connectTimeout(17, TimeUnit.SECONDS)
                .cache(null)
                .addNetworkInterceptor(interceptor).addInterceptor(interceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(Base_Url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        return retrofit.create(StudentStaffCard.class);
    }
}





