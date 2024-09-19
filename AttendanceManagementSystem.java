

import java.util.Scanner;

public class AttendanceManagementSystem {
    // Constants
    static final int TOTAL_DAYS = 5;
    static final int TOTAL_STUDENTS = 4;

    // Function to display attendance
    public static void displayAttendance(String className, String[] students, char[][] attendance) {
        System.out.println("\nAttendance for " + className + " class in August:");
        System.out.println("Student\t\t\tAttendance (P for Present, A for Absent)");

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.print(students[i] + "\t\t");
            for (int j = 0; j < TOTAL_DAYS; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SY Java class students
        String[] syStudents = new String[TOTAL_STUDENTS];
        System.out.println("Enter the names of SY(Java class) students:");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            syStudents[i] = sc.nextLine();
        }

        // TY AI class students
        String[] tyStudents = new String[TOTAL_STUDENTS];
        System.out.println("Enter the names of TY(AI class) students:");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            tyStudents[i] = sc.nextLine();
        }

        // Attendance for SY Java class
        char[][] syAttendance = new char[TOTAL_STUDENTS][TOTAL_DAYS];
        System.out.println("\nEnter attendance for SY(Java class) (P for Present, A for Absent):");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Attendance for " + syStudents[i] + ":");
            for (int j = 0; j < TOTAL_DAYS; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                syAttendance[i][j] = sc.next().charAt(0);
            }
        }

        // Attendance for TY AI class
        char[][] tyAttendance = new char[TOTAL_STUDENTS][TOTAL_DAYS];
        System.out.println("\nEnter attendance for TY(AI class) (P for Present, A for Absent):");
        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Attendance for " + tyStudents[i] + ":");
            for (int j = 0; j < TOTAL_DAYS; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                tyAttendance[i][j] = sc.next().charAt(0);
            }
        }

        // Display the attendance records
        displayAttendance("SY(Java)", syStudents, syAttendance);
        displayAttendance("TY(AI)", tyStudents, tyAttendance);
        
        sc.close();
    }
}

