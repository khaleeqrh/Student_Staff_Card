package com.example.student_staff_card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("First_name")
    @Expose
    private String firstName;
    @SerializedName("Last_name")
    @Expose
    private String lastName;
    @SerializedName("Father_name")
    @Expose
    private String fatherName;
    @SerializedName("Reg_no")
    @Expose
    private String regNo;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("adress")
    @Expose
    private String adress;
    @SerializedName("contact")
    @Expose
    private String contact;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public StudentModel() {
    }

    /**
     *
     * @param regNo
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param createdAt
     * @param gender
     * @param contact
     * @param adress
     * @param id
     * @param updatedAt
     */
    public StudentModel(Integer id, String firstName, String lastName, String fatherName, String regNo, String gender, String adress, String contact, String createdAt, String updatedAt) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.regNo = regNo;
        this.gender = gender;
        this.adress = adress;
        this.contact = contact;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}