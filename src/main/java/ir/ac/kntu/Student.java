package ir.ac.kntu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

import static ir.ac.kntu.Global.SYSTEM_WORK;
import static ir.ac.kntu.Global.SYSTEM_WORK_STUDENT;
import static ir.ac.kntu.Global.*;

public class Student extends User {
    final int maximum = 20;
    Scanner input = new Scanner(System.in);
    private String name;
    private HashSet<Course> courses;
    private HashMap<Course, Double> coursesAndGrade;
    private HashSet<CourseGroup> courseGroupChosenHashSet = new HashSet<>();

    public Student(String name, String password, String userName) {
        super(userName, password);
        this.name = name;
    }

    public Student(String userName, String password) {
        super(userName, password);
    }

    public Student() {

    }

    /**
     * this method is for show the menu of student to login the system.
     */
    public void showMenuStudent() {
        System.out.println("Please Choose One Of the Option:\n 1)SHOW STUDENT CLASSES\n 2)SELECT UNIT\n 3)SELECT FOOD\n 9)Menu\n 10)EXIT\n");
        int number = Integer.parseInt(input.nextLine());
        switch (number) {
            case 1:
                SYSTEM_WORK_STUDENT.showStudentClasses();
                break;
            case 2:
                SYSTEM_WORK_STUDENT.selectUnit();
                break;
            case 3:

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
     * this method is from login the Student User to the System
     */
    public void loginStudent() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        super.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        super.userName = userName;
    }

    public HashSet<Course> getCourses() {
        return courses;
    }

    public void setCourses(HashSet<Course> courses) {
        this.courses = courses;
    }

    public HashMap<Course, Double> getCoursesAndGrade() {
        return coursesAndGrade;
    }

    public void setCoursesAndGrade(HashMap<Course, Double> coursesAndGrade) {
        this.coursesAndGrade = coursesAndGrade;
    }

    public HashSet<CourseGroup> getCourseGroupChosenHashSet() {
        return courseGroupChosenHashSet;
    }

    public void setCourseGroupChosenHashSet(HashSet<CourseGroup> courseGroupChosenHashSet) {
        this.courseGroupChosenHashSet = courseGroupChosenHashSet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return maximum == student.maximum && Objects.equals(input, student.input) && Objects.equals(name, student.name) && Objects.equals(courses, student.courses) && Objects.equals(coursesAndGrade, student.coursesAndGrade) && Objects.equals(courseGroupChosenHashSet, student.courseGroupChosenHashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maximum, input, name, courses, coursesAndGrade, courseGroupChosenHashSet);
    }
}

