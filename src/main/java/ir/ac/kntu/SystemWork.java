package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * In This Class We Organize Classes and In Child's we Organize Admin, Students, Professors.
 */
public class SystemWork {
    Scanner input = new Scanner(System.in);
    private final HashMap<Integer, Course> courseHashMap = new HashMap<>();
    private final HashMap<Integer, CourseGroup> courseGroupHashMap = new HashMap<>();
    private HashMap<String, TimeTable> timeTableHashMap = new HashMap<>();

    public SystemWork() {
        defaultContain();
    }

    /**
     * in this method we go to define 9 Courses and 27 GroupCourses
     */
    public void defaultContain() {
        courseHashMap.put(100, new Course("math1", 100));
        courseHashMap.put(200, new Course("math2", 200));
        courseHashMap.put(300, new Course("physics1", 300));
        courseHashMap.put(400, new Course("physics2", 400));
        courseHashMap.put(500, new Course("AP", 500));
        courseHashMap.put(600, new Course("engineeringMathematics", 600));
        courseHashMap.put(700, new Course("engineeringProbability", 700));
        courseHashMap.put(800, new Course("dataStructure", 800));
        courseHashMap.put(900, new Course("technicalLanguage", 900));
        courseGroupHashMap.put(101, new CourseGroup("math1", 101));
        courseGroupHashMap.put(102, new CourseGroup("math1", 102));
        courseGroupHashMap.put(103, new CourseGroup("math1", 103));
        courseGroupHashMap.put(201, new CourseGroup("math2", 201));
        courseGroupHashMap.put(202, new CourseGroup("math2", 202));
        courseGroupHashMap.put(203, new CourseGroup("math2", 203));
        courseGroupHashMap.put(301, new CourseGroup("physics1", 301));
        courseGroupHashMap.put(302, new CourseGroup("physics1", 302));
        courseGroupHashMap.put(303, new CourseGroup("physics1", 303));
        courseGroupHashMap.put(401, new CourseGroup("physics2", 401));
        courseGroupHashMap.put(402, new CourseGroup("physics2", 402));
        courseGroupHashMap.put(403, new CourseGroup("physics2", 403));
        courseGroupHashMap.put(501, new CourseGroup("AP", 501));
        courseGroupHashMap.put(502, new CourseGroup("AP", 502));
        courseGroupHashMap.put(503, new CourseGroup("AP", 503));
        courseGroupHashMap.put(601, new CourseGroup("engineeringMathematics", 601));
        courseGroupHashMap.put(602, new CourseGroup("engineeringMathematics", 602));
        courseGroupHashMap.put(603, new CourseGroup("engineeringMathematics", 603));
        courseGroupHashMap.put(701, new CourseGroup("engineeringProbability", 701));
        courseGroupHashMap.put(702, new CourseGroup("engineeringProbability", 702));
        courseGroupHashMap.put(703, new CourseGroup("engineeringProbability", 703));
        courseGroupHashMap.put(801, new CourseGroup("dataStructure", 801));
        courseGroupHashMap.put(802, new CourseGroup("dataStructure", 802));
        courseGroupHashMap.put(803, new CourseGroup("dataStructure", 803));
        courseGroupHashMap.put(901, new CourseGroup("technicalLanguage", 901));
        courseGroupHashMap.put(902, new CourseGroup("technicalLanguage", 902));
        courseGroupHashMap.put(903, new CourseGroup("technicalLanguage", 903));
    }


    /**
     * Definition course by Admin by Name's Course
     */
    public void generateCourse() {
        System.out.println("Please Enter A Name For Course:");
        String name = input.nextLine();
        System.out.println("Please Enter A Number For Course:");
        Integer number = Integer.parseInt(input.nextLine());
        courseHashMap.put(number, new Course(name, number));
        System.out.println("The new Course added to Courses.");
    }

    /**
     * Definition courseGroup by Admin by NUmber's Course
     */
    public void generateCourseGroup() {
        System.out.println("Please Enter A Name For CourseGroup:");
        String name = input.nextLine();
        System.out.println("Please Enter A Number For CourseGroup:");
        Integer number = Integer.parseInt(input.nextLine());
        courseGroupHashMap.put(number, new CourseGroup(name, number));
        System.out.println("The new CourseGroup added to CourseGroups.");
    }

    /**
     * return Courses
     */
    public HashMap<Integer, Course> showCourses() {
        return courseHashMap;
    }

    /**
     * return Courses
     */
    public HashMap<Integer, CourseGroup> showCourseGroups() {
        return courseGroupHashMap;
    }

    /**
     * remove the CourseGroup from hashmapCourses by Admin by Number's Course
     */
    public void removeCourseGroups() {
        System.out.println("Please Enter CourseGroup Number:");
        Integer number = Integer.parseInt(input.nextLine());
        if (courseGroupHashMap.containsKey(number)) {
            courseHashMap.remove(number);
        }
        System.out.println("The CourseGroup has been removed!");
    }


    /**
     * Edit CourseGroup by Admin by ID's Course
     */
    public void editCourseGroups() {
        System.out.println("Please Enter CourseGroup Number: ");
        Integer number = Integer.parseInt(input.nextLine());
        if (courseGroupHashMap.containsKey(number)) {
            System.out.println("Enter new name for CourseGroup:");
            String newName = input.nextLine();
            System.out.println("Enter new number for CourseGroup:");
            Integer newNumber = Integer.parseInt(input.nextLine());
            courseGroupHashMap.get(number).setName(newName);
            courseGroupHashMap.get(number).setNum(newNumber);
            System.out.println("The CourseGroup has been edited.");
        } else {
            System.out.println("Invalid Input!");
        }

    }

    public HashMap<Integer, Course> getCourseHashMap() {
        return courseHashMap;
    }

    public HashMap<Integer, CourseGroup> getCourseGroupHashMap() {
        return courseGroupHashMap;
    }
}