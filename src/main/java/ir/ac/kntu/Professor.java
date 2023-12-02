package ir.ac.kntu;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

import static ir.ac.kntu.Global.SYSTEM_WORK;
import static ir.ac.kntu.Global.SYSTEM_WORK_PROFESSOR;
import static ir.ac.kntu.Global.*;
public class Professor extends User {
    private String name;
    private HashSet<CourseGroup> courseGroupChosenHashSet = new HashSet<>();

    Scanner input = new Scanner(System.in);

    public Professor(String name, String password, String userName) {
        super();
        this.name = name;
    }

    public Professor(String userName, String password) {
        super(userName,password);
    }

    public Professor() {

    }

    /**
     * this method is for show the menu of professors to login the system.
     */
    public void showMenuProfessor() {

        System.out.println("Please Choose One Of the Option:\n 1)SHOW PROFESSOR CLASSES\n 9)Menu\n 10)EXIT\n");
        int number = Integer.parseInt(input.nextLine());
        switch (number) {
            case 1:
                SYSTEM_WORK_PROFESSOR.showProfessorClasses();
                break;
            case 9:
                Menu.startMenu();
                break;
            case 10:
                System.exit(0);
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }
    }

    /**
     * this method for login the professor user to the system.
     */
    public void loginProfessor() {

    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public HashSet<CourseGroup> getCourseGroupChosenHashSet() {
        return courseGroupChosenHashSet;
    }

    public void setCourseGroupChosenHashSet(HashSet<CourseGroup> courseGroupChosenHashSet) {
        this.courseGroupChosenHashSet = courseGroupChosenHashSet;
    }

    public void setUserName(String userName) {
        super.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(name, professor.name) && Objects.equals(courseGroupChosenHashSet, professor.courseGroupChosenHashSet) && Objects.equals(input, professor.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseGroupChosenHashSet, input);
    }
}
