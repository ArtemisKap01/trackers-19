package com.trackers19.models;

import com.trackers19.common.Utilities;

import java.util.Date;

public class Student extends User {

    private int schoolClassId;

    public Student(){

    }

    public Student(int id, String amka, String username, String password, String firstName, String lastName, String email, Date birthdate, String address, String phoneNumber, int schoolClassId) {
        super(id, amka, username, password, firstName, lastName, email, birthdate, address, phoneNumber, Utilities.UserRole.Student);
        this.schoolClassId = schoolClassId;
    }

    public int getSchoolClassId() {
        return schoolClassId;
    }

    public void setSchoolClassId(int schoolClassId) {
        this.schoolClassId = schoolClassId;
    }
}
