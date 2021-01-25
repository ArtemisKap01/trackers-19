package com.trackers19.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Utilities {

    public static String appName = "Trackers19";

    public enum UserRole {None, Admin, Teacher, Student}

    public static String getSeparator() {
        return getSeparator(1);
    }

    public static String getSeparator(int x) {
        String separator = "";
        for (int i = 0; i <= x; i++) {
            separator += "──────────────────────────────────────────────";
        }
        return separator;
    }

    public static String padLeftSpaces(String inputString, int length) {
        StringBuilder sb = new StringBuilder();
        if (inputString == null || inputString.isBlank())
            inputString = "N/A";
        if (inputString.length() >= length)
            return inputString;
        while (sb.length() < length - inputString.length()) {
            sb.append(' ');
        }
        sb.append(inputString);
        return sb.toString();
    }

    public static String promptUserForText(String label) {
        System.out.print(label);
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Read input
            input = br.readLine();
            // Validate input
            while (input.isEmpty() || input.isBlank()) {
                System.out.println("> Invalid input. Please try again");
                input = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public static int promptUserForInt(String label) {
        System.out.print(label);
        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Read input
            input = br.readLine();

            // Validate input
            while (input.isEmpty() || input.isBlank() || !isNumeric(input)) {
                System.out.println("> Invalid input. Please try again");
                input = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(input);
    }


    public static Date promptUserForDate(String label) {
        System.out.print(label);
        String input = "";
        Date date = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Read input
            input = br.readLine();

            // Validate input
            while (input.isEmpty() || input.isBlank() || !isDate(input)) {
                System.out.println("> Invalid input. Please try again using the format 'dd/MM/yyyy'");
                input = br.readLine();
            }

            date = new SimpleDateFormat("dd/MM/yyyy").parse(input);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isDate(String strDate) {
        if (strDate == null) {
            return false;
        }
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
        } catch (NumberFormatException | ParseException nfe) {
            return false;
        }
        return true;
    }

    public static String convertDateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.format(date);
        } catch (Exception ex) {
            return dateFormat.format(Date.from(Instant.ofEpochMilli(0)));
        }
    }

    public static Date convertStringToDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return Date.from(Instant.ofEpochMilli(0));
        }
    }

}
