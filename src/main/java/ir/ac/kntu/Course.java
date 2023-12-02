package ir.ac.kntu;

import java.util.HashMap;

public class Course {
    private Integer number;
    private String name;
    private HashMap<String, Course> beganCourseHashMap;


    public Course(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public Course(String name) {
        this.name = name;
    }

    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return number;
    }

    public void setNum(Integer number) {
        this.number = number;
    }

    public HashMap<String, Course> getBeganCourseHashMap() {
        return beganCourseHashMap;
    }

    public void setBeganCourseHashMap(HashMap<String, Course> beganCourseHashMap) {
        this.beganCourseHashMap = beganCourseHashMap;
    }

    @Override
    public String toString() {
        return "Course{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", beganCourseHashMap=" + beganCourseHashMap +
                '}';
    }

    enum TypeClass {
        Majazy, Hozoory
    }
}
