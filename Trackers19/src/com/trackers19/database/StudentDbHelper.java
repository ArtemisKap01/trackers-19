package com.trackers19.database;

import com.trackers19.common.Utilities;
import com.trackers19.models.Student;
import com.trackers19.models.Teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDbHelper {
    public static final String tableName = "Students";

    public static boolean createTable() throws Exception {
        boolean result = false;
        try {
            AppDatabase db = new AppDatabase();
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName
                    + " ( "
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , "
                    + "AMKA CHAR(10) NOT NULL, "
                    + "Username CHAR(20) NOT NULL, "
                    + "Password CHAR(30) NOT NULL, "
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

    public static Student loginStudent(String username, String password) throws Exception {
        String query = "SELECT * FROM Students WHERE Username = '" + username + "' AND Password = '" + password + "'; ";
        Student student = null;

        try {
            AppDatabase db = new AppDatabase();
            ResultSet rs = db.getDbConnection().createStatement().executeQuery(query);
            student = convertToStudent(rs);
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to login student");
        }

        return student;
    }

    public static boolean insertStudent(Student student) {
        boolean result = false;

        try {
            AppDatabase db = new AppDatabase();
            String sql = "INSERT INTO " + tableName
                    + "('Username','Password', 'AMKA', 'FirstName','LastName','Email','PhoneNumber','Address','Birthdate','SchoolClassId')"
                    + " VALUES ("
                    + " '" + student.getUsername() + "', "
                    + " '" + student.getPassword() + "', "
                    + " '" + student.getAmka() + "', "
                    + " '" + student.getFirstName() + "', "
                    + " '" + student.getLastName() + "', "
                    + " '" + student.getEmail() + "', "
                    + " '" + student.getPhoneNumber() + "', "
                    + " '" + student.getAddress() + "', "
                    + " '" + Utilities.convertDateToString(student.getBirthdate()) + "', "
                    + "  " + student.getSchoolClassId()
                    + " );";
            result = db.executeStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Student> loadAllStudents() {
        String sql = "SELECT * FROM Students;";
        List<Student> students = new ArrayList<Student>();

        try (Connection conn = new AppDatabase().getDbConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Student student = convertToStudent(rs);
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static List<Student> loadStudents(int schoolClassId) {
        String sql = "SELECT * FROM Students WHERE schoolClassId = " + schoolClassId + ";";
        List<Student> students = new ArrayList<Student>();

        try (Connection conn = new AppDatabase().getDbConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                Student student = convertToStudent(rs);
                students.add(student);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static void displayStudents(List<Student> students) {
        String headers = Utilities.padLeftSpaces("Id", 5)
                + Utilities.padLeftSpaces("AMKA", 12)
                + Utilities.padLeftSpaces("FirstName", 15)
                + Utilities.padLeftSpaces("LastName", 20)
                + Utilities.padLeftSpaces("Email", 50)
                + Utilities.padLeftSpaces("Birthdate", 15)
                + Utilities.padLeftSpaces("Address", 40)
                + Utilities.padLeftSpaces("PhoneNumber", 20);

        System.out.println(headers);
        System.out.println(Utilities.getSeparator(3));

        if (students.isEmpty()) {
            System.out.println("No student data found");
        } else {
            for (Student s : students) {
                if (s.getId() > 0) {
                    String row = Utilities.padLeftSpaces(s.getId() + "", 5)
                            + Utilities.padLeftSpaces(s.getAmka() + "", 12)
                            + Utilities.padLeftSpaces(s.getFirstName(), 15)
                            + Utilities.padLeftSpaces(s.getLastName(), 20)
                            + Utilities.padLeftSpaces(s.getEmail(), 50)
                            + Utilities.padLeftSpaces(Utilities.convertDateToString(s.getBirthdate()), 15)
                            + Utilities.padLeftSpaces(s.getAddress(), 40)
                            + Utilities.padLeftSpaces(s.getPhoneNumber(), 20);
                    System.out.println(row);
                }
            }
        }
    }

    private static Student convertToStudent(ResultSet rs) {
        Student student = null;
        try {
            int id = rs.getInt("Id");
            String password = rs.getString("Password");
            String firstName = rs.getString("FirstName");
            String lastName = rs.getString("LastName");
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString("Birthdate"));
            String address = rs.getString("Address");
            String amka = rs.getString("AMKA");
            String phone = rs.getString("PhoneNumber");
            String email = rs.getString("Email");
            int schoolClassId = rs.getInt("SchoolClassId");

            student = new Student();
            student.setId(id);
            student.setPassword(password);
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setAmka(amka);
            student.setBirthdate(birthDate);
            student.setAddress(address);
            student.setPhoneNumber(phone);
            student.setEmail(email);
            student.setSchoolClassId(schoolClassId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }

}
