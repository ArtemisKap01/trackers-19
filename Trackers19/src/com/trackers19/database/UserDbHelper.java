package com.trackers19.database;

import com.trackers19.common.Utilities;
import com.trackers19.models.User;

public class UserDbHelper {

    public static User loginUser(String username, String password) throws Exception {
        // Check for empty user credentials
        if (username.isBlank() || password.isBlank())
            throw new Exception("User credentials cannot be empty");

        // Check for admin credentials
        if (username.equals("admin") && password.equals("admin")) {
            return new User(Utilities.UserRole.Admin, "System", "Administrator");
        }

        // Check for student login
        User user = StudentDbHelper.loginStudent(username, password);
        if (user != null)
            return user;

        // Check for teacher login
        user = TeacherDbHelper.loginTeacher(username, password);
        if (user != null)
            return user;

        return new User(Utilities.UserRole.None, "","");
    }
}
