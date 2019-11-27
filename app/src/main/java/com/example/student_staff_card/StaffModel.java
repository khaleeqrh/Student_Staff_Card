package com.example.student_staff_card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StaffModel {
    @SerializedName("First_name")
    @Expose
    public String firstName;
    @SerializedName("Last_name")
    @Expose
    public String lastName;
    @SerializedName("Department_id")
    @Expose
    public String departmentId;
    @SerializedName("Designation_id")
    @Expose
    public String designationId;
    @SerializedName("Adress")
    @Expose
    public String adress;
    @SerializedName("Contact")
    @Expose
    public String contact;
    @SerializedName("gender_id")
    @Expose
    public String genderId;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("updated_at")
    @Expose
    public String updatedAt;
    @SerializedName("created_at")
    @Expose
    public String createdAt;
    @SerializedName("id")
    @Expose
    public Integer id;
}