package ir.ac.kntu;

import java.util.Scanner;

import static ir.ac.kntu.Global.*;

public class Menu {
    Scanner input = new Scanner(java.lang.System.in);
    private static String userName;
    private static String password;

    public void startMenu() {
        boolean runLoop = true;
        do {
            System.out.println("Please Enter Your UserName:");
            userName = input.nextLine();
            System.out.println("Please Enter Your Password:");
            password = input.nextLine();
            int number = checkTypeOfUser(userName, password);
            switch (number) {
                case 0:
                    loginUser(number);
                    continue;
                case -1:
                    loginUser(number);
                    continue;
                case 1:
                    loginUser(number);
                    SYSTEM_WORK_ADMIN.defaultContainAdmin();
                    continue;
                case 2:
                    loginUser(number);
                    SYSTEM_WORK_STUDENT.defaultContainStudent();
                    //SYSTEM_WORK_STUDENT.defaultStudentCourseGroup();
                    continue;
                case 3:
                    loginUser(number);
                    SYSTEM_WORK_PROFESSOR.defaultContainProfessor();
                    //  SYSTEM_WORK_PROFESSOR.defaultProfessorCourseGroup();
                    continue;
                case 9:
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + number);
            }
        } while (true);
    }

    public int checkTypeOfUser(String userName, String password) {
        int typeNumber = 0;
        if (SYSTEM_WORK_ADMIN.getAdminHashMap().containsKey(userName)) {
            if (SYSTEM_WORK_ADMIN.getAdminHashMap().get(userName).getPassword().equals(password)) {
                typeNumber = 1;
            } else {
                typeNumber = -1;
            }


        } else if (SYSTEM_WORK_STUDENT.getStudentHashMap().containsKey(userName)) {
            if (SYSTEM_WORK_STUDENT.getStudentHashMap().get(userName).getPassword().equals(password)) {
                typeNumber = 2;
            } else {
                typeNumber = -1;
            }
        } else if (SYSTEM_WORK_PROFESSOR.getProfessorHashMap().containsKey(userName)) {
            if (SYSTEM_WORK_PROFESSOR.getProfessorHashMap().get(userName).getPassword().equals(password)) {
                typeNumber = 3;
            } else {
                typeNumber = -1;
            }
        }
        return typeNumber;
    }

    public void loginUser(int number) {
        if (number == 1) {
            SYSTEM_WORK_ADMIN.loginAdmin(userName);
        } else if (number == 2) {
            SYSTEM_WORK_STUDENT.loginStudent(userName);
        } else if (number == 3) {
            SYSTEM_WORK_PROFESSOR.loginProfessor(userName);
        } else if (number == 0) {
            System.out.println("This User Not Found!");
        } else if (number == -1) {
            System.out.println("Invalid Password!");
        }
    }
}