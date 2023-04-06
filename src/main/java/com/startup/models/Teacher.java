package com.startup.models;

public class Teacher {

    private long teacherId;
    private String firstName;
    private String lastName;
    private String gender;
    private String cnp;
    private String address;
    private String phoneNumber;
    private String email;

    public Teacher(){}

    public Teacher(long teacherId, String firstName, String lastName, String gender,
                   String cnp, String address, String phoneNumber, String email){
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cnp = cnp;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getTeacherId(){
        return teacherId;
    }

    public void setTeacherId(long teacherId){
        this.teacherId = teacherId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
