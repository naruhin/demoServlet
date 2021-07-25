package com.example.demo1;

public class Employee {

    private int id;
    private String firstName;
    private String secondName;
    private String birthdate;
    public String speciality;
    private String country;
    private String phoneNumber;
    private String email;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSecondName() { return secondName; }

    public void setSecondName(String secondName) { this.secondName = secondName; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee:" +
                " first_name: " + firstName +
                "; second_name: " + secondName +
                "; birthdate: " + birthdate +
                "; speciality: " + speciality +
                "; email: " + email +
                "; country: " + country +
                "; phone_number: " + phoneNumber + '\n';
    }
}
