package com.example.student_staff_card;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StaffModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("First_name")
    @Expose
    private String firstName;
    @SerializedName("Last_name")
    @Expose
    private String lastName;
    @SerializedName("Department_id")
    @Expose
    private String departmentId;
    @SerializedName("Designation_id")
    @Expose
    private String designationId;
    @SerializedName("gender_id")
    @Expose
    private String genderId;
    @SerializedName("created_at")
    @Expose
    private Object createdAt;
    @SerializedName("updated_at")
    @Expose
    private Object updatedAt;

    /**
     * No args constructor for use in serialization
     *
     */
    public StaffModel() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param createdAt
     * @param designationId
     * @param departmentId
     * @param genderId
     * @param id
     * @param updatedAt
     */
    public StaffModel(Integer id, String firstName, String lastName, String departmentId, String designationId, String genderId, Object createdAt, Object updatedAt) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.designationId = designationId;
        this.genderId = genderId;
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDesignationId() {
        return designationId;
    }

    public void setDesignationId(String designationId) {
        this.designationId = designationId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public Object getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Object updatedAt) {
        this.updatedAt = updatedAt;
    }

}