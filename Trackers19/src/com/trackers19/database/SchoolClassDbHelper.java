package com.trackers19.database;

import com.trackers19.common.Utilities;
import com.trackers19.models.SchoolClass;
import com.trackers19.models.Student;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolClassDbHelper {
    public static final String tableName = "SchoolClasses";

    public static boolean createTable() throws Exception {
        boolean result = false;
        try {
            AppDatabase db = new AppDatabase();
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName
                    + " ( "
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                    + "Name CHAR(20) NOT NULL "
                    + " );";
            result = db.executeStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Failed to create table " + tableName);
        }
        return result;
    }

    public static boolean insertSchoolClass(SchoolClass schoolClass) {
        boolean result = false;

        try {
            AppDatabase db = new AppDatabase();
            String sql = "INSERT INTO " + tableName + " ('Name') VALUES ( '" + schoolClass.getName() + "' );";
            result = db.executeStatement(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<SchoolClass> loadAllSchoolClasses() {
        List<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
        try {
            AppDatabase db = new AppDatabase();
            ResultSet rs = db.getDbConnection().createStatement().executeQuery("SELECT * FROM " + tableName);

            while (rs.next()) {
                SchoolClass schoolClass = convertToSchoolClass(rs);
                schoolClasses.add(schoolClass);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return schoolClasses;
    }

    public static void displaySchoolClasses(List<SchoolClass> schoolClasses) {
        String headers = Utilities.padLeftSpaces("Id", 5)
                + Utilities.padLeftSpaces("Name", 5);

        System.out.println(headers);
        System.out.println(Utilities.getSeparator(3));

        if (schoolClasses.isEmpty()) {
            System.out.println("No school class data found");
        } else {
            for (SchoolClass s : schoolClasses) {
                if (s.getId() > 0) {
                    String row = Utilities.padLeftSpaces(s.getId() + "", 5)
                            + Utilities.padLeftSpaces(s.getName() + "", 5);
                    System.out.println(row);
                }
            }
        }
    }

    private static SchoolClass convertToSchoolClass(ResultSet rs) {
        SchoolClass schoolClass = null;
        try {
            int id = rs.getInt("Id");
            String name = rs.getString("Name");

            schoolClass = new SchoolClass();
            schoolClass.setId(id);
            schoolClass.setName(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return schoolClass;
    }


}
