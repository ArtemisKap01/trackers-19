package com.trackers19.models;

import com.trackers19.common.Utilities;

import java.util.Date;

public class Teacher extends User {

    private int schoolClassId;
    private String afm;

    public Teacher() {
    }

    public Teacher(int id, String afm, String amka, String username, String password, String firstName, String lastName, String email, Date birthdate, String address, String phoneNumber, int schoolClassId) {
        super(id, amka, username, password, firstName, lastName, email, birthdate, address, phoneNumber, Utilities.UserRole.Teacher);
        this.afm = afm;
        this.schoolClassId = schoolClassId;
    }

    public int getSchoolClassId() {
        return schoolClassId;
    }

    public void setSchoolClassId(int schoolClassId) {
        this.schoolClassId = schoolClassId;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }
}
