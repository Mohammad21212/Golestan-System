package ir.ac.kntu;

import java.util.Objects;
import java.util.Scanner;

import static ir.ac.kntu.Global.*;

public class Admin extends User {
    Scanner input = new Scanner(System.in);

    public Admin(String userName, String password) {
        super(userName, password);
    }

    public Admin() {

    }

    public void showMenuAdmin() {
        int number;
        while (true) {
            System.out.println("Please Choose One Of The Option:\n 1)ADD NEW STUDENT\n 2)ADD NEW PROFESSOR\n" +
                    " 3)ADD NEW CLASS\n 4)EDIT CLASS\n 5)REMOVE CLASS\n 6)SELECT UNIT\n 7)SHOW STUDENTS\n 8)SHOW PROFESSOR\n 9)Menu\n 10)EXIT\n");
            number = Integer.parseInt(input.nextLine());
            switch (number) {
                case 1:
                    SYSTEM_WORK_ADMIN.generateStudent();
                    break;
                case 2:
                    SYSTEM_WORK_ADMIN.generateProfessor();
                    break;
                case 3:
                    SYSTEM_WORK.generateCourse();
                    break;
                case 4:
                    SYSTEM_WORK.editCourseGroups();
                    break;
                case 5:
                    SYSTEM_WORK.removeCourseGroups();
                    break;
                case 6:
                    SYSTEM_WORK_ADMIN.selectUnit();
                    break;
                case 7:
                    SYSTEM_WORK_STUDENT.showStudents();
                    break;
                case 8:
                    SYSTEM_WORK_PROFESSOR.showProfessor();
                case 9:
                    Menu.startMenu();
                    break;
                case 10:


                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + number);
            }
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        super.userName = userName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(input, admin.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input);
    }
}