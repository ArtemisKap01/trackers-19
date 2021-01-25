package com.trackers19.models;

import com.trackers19.common.Utilities;

import java.util.Date;

public class User {
    private int id;
    private String amka;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthdate;
    private String address;
    private String phoneNumber;
    private Utilities.UserRole userRole;

    public User() {
    }

    public User(Utilities.UserRole userRole, String firstName, String lastName) {
        this.userRole = userRole;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(int id, String amka, String username, String password, String firstName, String lastName, String email, Date birthdate, String address, String phoneNumber, Utilities.UserRole userRole) {
        this.id = id;
        this.amka = amka;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public String getUsername() {
        return this.firstName.charAt(0) + this.lastName;
    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public Utilities.UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(Utilities.UserRole userRole) {
        this.userRole = userRole;
    }
}
