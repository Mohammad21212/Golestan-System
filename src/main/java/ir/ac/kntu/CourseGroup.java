package ir.ac.kntu;

import java.util.HashMap;
import java.util.Objects;

public class CourseGroup extends Course {
    private Integer numberGroup;
    private Integer numberOfTerm;
    private HashMap<Integer, Integer> timetable;
    private HashMap<String, Course> prerequisiteCourse;

    public CourseGroup(String name, Integer numberGroup) {
        super(name);
        this.numberGroup = numberGroup;
    }

    public CourseGroup() {

    }


    public CourseGroup(String name) {
        super(name);
    }

    public Integer getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(Integer numberGroup) {
        this.numberGroup = numberGroup;
    }

    public Integer getNumberOfTerm() {
        return numberOfTerm;
    }

    public void setNumberOfTerm(Integer numberOfTerm) {
        this.numberOfTerm = numberOfTerm;
    }

    public HashMap<Integer, Integer> getTimetable() {
        return timetable;
    }

    public void setTimetable(HashMap<Integer, Integer> timetable) {
        this.timetable = timetable;
    }

    public HashMap<String, Course> getPrerequisiteCourse() {
        return prerequisiteCourse;
    }

    public void setPrerequisiteCourse(HashMap<String, Course> prerequisiteCourse) {
        this.prerequisiteCourse = prerequisiteCourse;
    }

    @Override
    public String toString() {
        return "CourseGroup{" +
                "numberGroup=" + numberGroup +
                ", numberOfTerm=" + numberOfTerm +
                ", timetable=" + timetable +
                ", prerequisiteCourse=" + prerequisiteCourse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CourseGroup that = (CourseGroup) o;
        return Objects.equals(numberGroup, that.numberGroup) && Objects.equals(numberOfTerm, that.numberOfTerm) && Objects.equals(timetable, that.timetable) && Objects.equals(prerequisiteCourse, that.prerequisiteCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberGroup, numberOfTerm, timetable, prerequisiteCourse);
    }
}
