package com.trackers19.database;

import com.trackers19.common.Utilities;
import com.trackers19.models.Student;
import com.trackers19.models.Teacher;
import com.trackers19.models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherDbHelper {
    public static final String tableName = "Teachers";

    public static boolean createTable() throws Exception {
        boolean result = false;
        try {
            AppDatabase db = new AppDatabase();
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " ( "
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL  , "
                    + "AMKA CHAR(10) NOT NULL, "
                    + "Username CHAR(20) NOT NULL, "
                    + "Password CHAR(30) NOT NULL, "
                    + "AFM CHAR(9) NOT NULL, "
                    + "FirstName CHAR(50) NOT NULL, "
                    + "LastName CHAR(50) NOT NULL, "
                    + "Address CHAR(100) NOT NULL, "
                    + "PhoneNumber CHAR(20) NOT NULL, "
                    + "Email CHAR(50) NOT NULL, "
                    + "Birthdate DATE NOT NULL, "
                    + "SchoolClassId INTEGER NOT NULL "
                    + " );";
            result = db.executeStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to create table " + tableName);
        }

        return result;
    }

    public static User loginTeacher(String username, String password) throws Exception {
        String query = "SELECT * FROM Teachers WHERE Username = '" + username + "' AND Password = '" + password + "'; ";
        Teacher teacher = null;

        try {
            AppDatabase db = new AppDatabase();
            ResultSet rs = db.getDbConnection().createStatement().executeQuery(query);
            teacher = convertToTeacher(rs);
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to login teacher");
        }

        return teacher;
    }


    public static boolean insertTeacher(Teacher teacher) {
        boolean result = false;

        try {
            AppDatabase db = new AppDatabase();
            String sql = "INSERT INTO " + tableName
                    + "('Username','Password','AFM', 'AMKA', 'FirstName','LastName','Email','PhoneNumber','Address', 'SchoolClassId', 'Birthdate')"
                    + " VALUES ("
                    + " '" + teacher.getUsername() + "', "
                    + " '" + teacher.getPassword() + "', "
                    + " '" + teacher.getAfm() + "', "
                    + " '" + teacher.getAmka() + "', "
                    + " '" + teacher.getFirstName() + "', "
                    + " '" + teacher.getLastName() + "', "
                    + " '" + teacher.getEmail() + "', "
                    + " '" + teacher.getPhoneNumber() + "', "
                    + " '" + teacher.getAddress() + "', "
                    + " " + teacher.getSchoolClassId() + ", "
                    + " '" + Utilities.convertDateToString(teacher.getBirthdate()) + "');";

            result = db.executeStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void displayTeachers(List<Teacher> teachers) {
        String headers = Utilities.padLeftSpaces("Id", 5)
                + Utilities.padLeftSpaces("AFM", 12)
                + Utilities.padLeftSpaces("AMKA", 12)
                + Utilities.padLeftSpaces("FirstName", 15)
                + Utilities.padLeftSpaces("LastName", 20)
                + Utilities.padLeftSpaces("Email", 50)
                + Utilities.padLeftSpaces("Birthdate", 15)
                + Utilities.padLeftSpaces("Address", 40)
                + Utilities.padLeftSpaces("PhoneNumber", 20);

        System.out.println(headers);
        System.out.println(Utilities.getSeparator(3));

        if (teachers.isEmpty()) {
            System.out.println("No teacher data found");
        } else {
            for (Teacher t : teachers) {
                if (t.getId() > 0) {
                    String row = Utilities.padLeftSpaces(t.getId() + "", 5)
                            + Utilities.padLeftSpaces(t.getAfm() + "", 12)
                            + Utilities.padLeftSpaces(t.getAmka() + "", 12)
                            + Utilities.padLeftSpaces(t.getFirstName(), 15)
                            + Utilities.padLeftSpaces(t.getLastName(), 20)
                            + Utilities.padLeftSpaces(t.getEmail(), 50)
                            + Utilities.padLeftSpaces(Utilities.convertDateToString(t.getBirthdate()), 15)
                            + Utilities.padLeftSpaces(t.getAddress(), 40)
                            + Utilities.padLeftSpaces(t.getPhoneNumber(), 20);
                    System.out.println(row);
                }
            }
        }
    }

    public static List<Teacher> loadAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        try {
            AppDatabase db = new AppDatabase();
            String query = "SELECT * FROM Teachers;";
            ResultSet rs = db.getDbConnection()
                    .createStatement()
                    .executeQuery(query);

            while (rs.next()) {
                Teacher teacher = convertToTeacher(rs);
                teachers.add(teacher);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teachers;
    }

    public static List<Teacher> loadTeachers(int schoolClassId) {
        String sql = "SELECT * FROM Teachers WHERE schoolClassId = " + schoolClassId + ";";
        List<Teacher> teachers = new ArrayList<Teacher>();

        try (Connection conn = new AppDatabase().getDbConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Teacher teacher = convertToTeacher(rs);
                teachers.add(teacher);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teachers;
    }

    private static Teacher convertToTeacher(ResultSet rs) {
        Teacher teacher = null;
        try {
            int id = rs.getInt("Id");
            String password = rs.getString("Password");
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString("Birthdate"));
            String address = rs.getString("Address");
            String amka = rs.getString("AMKA");
            String afm = rs.getString("AFM");
            String phone = rs.getString("PhoneNumber");
            String email = rs.getString("Email");
            int schoolClassId = rs.getInt("SchoolClassId");

            teacher = new Teacher();
            teacher.setId(id);
            teacher.setPassword(password);
            teacher.setFirstName(firstName);
            teacher.setLastName(lastName);
            teacher.setAmka(amka);
            teacher.setBirthdate(birthDate);
            teacher.setAddress(address);
            teacher.setAfm(afm);
            teacher.setPhoneNumber(phone);
            teacher.setEmail(email);
            teacher.setSchoolClassId(schoolClassId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return teacher;
    }

}
