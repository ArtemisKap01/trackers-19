package com.trackers19.common;

import com.trackers19.database.*;
import com.trackers19.models.SchoolClass;
import com.trackers19.models.Student;
import com.trackers19.models.Teacher;
import com.trackers19.models.User;

import java.util.Date;
import java.util.List;

public class Menu {
    public void showWelcomeBanner() {
        String separator = Utilities.getSeparator();
        System.out.println(separator);
        System.out.println("                      Welcome to " + Utilities.appName);
        System.out.println(separator);
        System.out.println();
    }

    public User showLoginMenu() {
        User user = null;
        boolean firstTime = true;
        boolean loginResult = false;
        try {
            while (!loginResult) {
                if (firstTime) {
                    System.out.println("Please login to continue ");
                    firstTime = false;
                } else {
                    System.out.println(Utilities.getSeparator());
                    System.out.println("Invalid credentials. Please try again.");
                }

                String username = Utilities.promptUserForText("> Enter your username: ");
                String password = Utilities.promptUserForText("> Enter your password: ");

                user = UserDbHelper.loginUser(username, password);
                if (user == null || user.getUserRole() == Utilities.UserRole.None) {
                    loginResult = false;
                } else {
                    loginResult = true;
                }
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void showAdminMenu(User admin) {
        boolean exit = false;
        do {
            System.out.println("\n");
            System.out.println(Utilities.getSeparator());
            System.out.println("Welcome " + admin.getUsername() + ", ");
            System.out.println();

            System.out.println("Please select an option: ");
            System.out.println("1 - Add teacher");
            System.out.println("2 - Add student");
            System.out.println("3 - Add school class");
            System.out.println("4 - Display all teachers");
            System.out.println("5 - Display all students");
            System.out.println("6 - Display all classes");
            System.out.println("7 - Exit");

            System.out.println("");
            String option = Utilities.promptUserForText("> ");
            switch (option) {
                case "1":
                    showAddTeacherMenu();
                    break;

                case "2":
                    showAddStudentMenu();
                    break;

                case "3":
                    showAddSchoolClassMenu();
                    break;

                case "4":
                    System.out.println("\n");
                    System.out.println(Utilities.getSeparator());
                    System.out.println("> Loading data for all teachers\n");
                    List<Teacher> teachers = TeacherDbHelper.loadAllTeachers();
                    TeacherDbHelper.displayTeachers(teachers);
                    break;

                case "5":
                    System.out.println("\n");
                    System.out.println(Utilities.getSeparator());
                    System.out.println("> Loading data for all students\n");
                    List<Student> students = StudentDbHelper.loadAllStudents();
                    StudentDbHelper.displayStudents(students);
                    break;

                case "6":
                    System.out.println("\n");
                    System.out.println(Utilities.getSeparator());
                    System.out.println("> Loading data for all school classes\n");
                    List<SchoolClass> schoolClasses = SchoolClassDbHelper.loadAllSchoolClasses();
                    SchoolClassDbHelper.displaySchoolClasses(schoolClasses);
                    break;

                case "7":
                    exit = true;
                    break;

                case "test":
                    testMenu();
                    break;

                default:
                    break;
            }
        } while (!exit);
    }

    public void showAddTeacherMenu() {
        System.out.println("\n");
        System.out.println(Utilities.getSeparator());
        System.out.println("Add new teacher\n");

        String firstName = Utilities.promptUserForText("Enter first name: ");
        String lastName = Utilities.promptUserForText("Enter last name: ");
        String password = Utilities.promptUserForText("Enter password: ");
        String afm = Utilities.promptUserForText("Enter afm: ");
        String amka = Utilities.promptUserForText("Enter amka: ");
        Date birthdate = Utilities.promptUserForDate("Enter birthdate: ");
        String address = Utilities.promptUserForText("Enter address: ");
        String phoneNumber = Utilities.promptUserForText("Enter phone number: ");
        String email = Utilities.promptUserForText("Enter email: ");
        int schoolClassId = Utilities.promptUserForInt("Enter school class id: ");

        Teacher teacher = new Teacher();
        teacher.setAfm(afm);
        teacher.setAmka(amka);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setBirthdate(birthdate);
        teacher.setPassword(password);
        teacher.setAddress(address);
        teacher.setPhoneNumber(phoneNumber);
        teacher.setEmail(email);
        teacher.setSchoolClassId(schoolClassId);

        System.out.println("\n");
        System.out.println("> Adding teacher [" + teacher.getUsername() + "] in database");
        boolean result = TeacherDbHelper.insertTeacher(teacher);

        if (result) {
            System.out.println("> Teacher was successfully inserted in database");
        } else {
            System.out.println("> Failed to insert teacher in database");
        }
    }

    public void showAddStudentMenu() {
        System.out.println("\n");
        System.out.println(Utilities.getSeparator());
        System.out.println("Add new student\n");

        String firstName = Utilities.promptUserForText("Enter first name: ");
        String lastName = Utilities.promptUserForText("Enter last name: ");
        String password = Utilities.promptUserForText("Enter password: ");
        String amka = Utilities.promptUserForText("Enter amka: ");
        Date birthdate = Utilities.promptUserForDate("Enter birthdate: ");
        String address = Utilities.promptUserForText("Enter address: ");
        String phoneNumber = Utilities.promptUserForText("Enter phone number: ");
        String email = Utilities.promptUserForText("Enter email: ");
        int schoolClassId = Utilities.promptUserForInt("Enter school class id: ");

        Student student = new Student();
        student.setAmka(amka);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setBirthdate(birthdate);
        student.setPassword(password);
        student.setAddress(address);
        student.setPhoneNumber(phoneNumber);
        student.setEmail(email);
        student.setSchoolClassId(schoolClassId);

        System.out.println("\n");
        System.out.println("> Adding student [" + student.getUsername() + "] in database");
        boolean result = StudentDbHelper.insertStudent(student);

        if (result) {
            System.out.println("> Student was successfully inserted in database");
        } else {
            System.out.println("> Failed to insert student in database");
        }
    }

    public void showAddSchoolClassMenu() {
        System.out.println("\n");
        System.out.println(Utilities.getSeparator());
        System.out.println("Add new school class\n");

        String name = Utilities.promptUserForText("Enter school class name: ");

        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setName(name);

        System.out.println("\n");
        System.out.println("> Adding school class [" + name + "] in database");
        boolean result = SchoolClassDbHelper.insertSchoolClass(schoolClass);

        if (result) {
            System.out.println("> Teacher was successfully inserted in database");
        } else {
            System.out.println("> Failed to insert teacher in database");
        }
    }

    public void showTeacherMenu(Teacher teacher) {
        String separator = Utilities.getSeparator();
        System.out.println();
        System.out.println(separator);
        System.out.println("Welcome " + teacher.getFirstName() + " " + teacher.getLastName() + ", ");

        System.out.println("Please select an option: ");
        System.out.println("1 - Fill questionnaire");
        System.out.println("2 - My data");
    }

    public void showStudentMenu(Student student) {
        String separator = Utilities.getSeparator();
        System.out.println();
        System.out.println(separator);
        System.out.println("Welcome " + student.getFirstName() + " " + student.getLastName() + ", ");

        System.out.println("Please select an option: ");
        System.out.println("1 - Fill questionnaire");
        System.out.println("2 - My data");
    }

    private static void testMenu() {
        List<SchoolClass> schoolClasses = SchoolClassDbHelper.loadAllSchoolClasses();

        for (SchoolClass schoolClass : schoolClasses) {
            int schoolClassId = schoolClass.getId();
            String schoolClassName = schoolClass.getName();

            System.out.println("> Loading all teachers from school class " + schoolClassName + " (" + schoolClassId + ")\n");
            List<Teacher> teachers = TeacherDbHelper.loadTeachers(schoolClassId);
            TeacherDbHelper.displayTeachers(teachers);
            System.out.println();

            System.out.println("> Loading all students from school class " + schoolClassName + " (" + schoolClassId + ")\n");
            List<Student> students = StudentDbHelper.loadStudents(schoolClassId);
            StudentDbHelper.displayStudents(students);
            System.out.println();
        }
    }

}
