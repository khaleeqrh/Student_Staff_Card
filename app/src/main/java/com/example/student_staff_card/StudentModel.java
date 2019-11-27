package com.example.student_staff_card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentModel {
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("First_name")
    @Expose
    public String firstName;
    @SerializedName("Last_name")
    @Expose
    public String lastName;
    @SerializedName("Father_name")
    @Expose
    public String fatherName;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("adress")
    @Expose
    public String adress;
    @SerializedName("contact")
    @Expose
    public Integer contact;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;
}