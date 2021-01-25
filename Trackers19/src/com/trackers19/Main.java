package com.trackers19;

import com.trackers19.common.Menu;
import com.trackers19.common.Utilities;
import com.trackers19.database.SchoolClassDbHelper;
import com.trackers19.database.StudentDbHelper;
import com.trackers19.database.TeacherDbHelper;
import com.trackers19.models.SchoolClass;
import com.trackers19.models.Student;
import com.trackers19.models.Teacher;
import com.trackers19.models.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        boolean dbInitialized = initializeDatabase();
        if (!dbInitialized) {
            System.out.println("> Terminating application " + Utilities.appName);
            System.exit(-1);
        }

        Menu menu = new Menu();
        menu.showWelcomeBanner();
        User user = menu.showLoginMenu();

        switch (user.getUserRole()) {
            case Admin:
                menu.showAdminMenu(user);
                break;
            case Teacher:
                menu.showTeacherMenu((Teacher) user);
                break;
            case Student:
                menu.showStudentMenu((Student) user);
                break;
            case None:
                System.out.println("> Terminating application " + Utilities.appName);
                break;
        }
    }

    private static boolean initializeDatabase() {
        System.out.println("> Connecting to database...");

        try {
            StudentDbHelper.createTable();
            TeacherDbHelper.createTable();
            SchoolClassDbHelper.createTable();
            System.out.println("> Opened database successfully\n\n\n\n");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
