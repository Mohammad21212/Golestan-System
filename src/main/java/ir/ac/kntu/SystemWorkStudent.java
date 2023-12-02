package ir.ac.kntu;

import java.util.HashMap;
import java.util.Objects;

public class SystemWorkStudent extends SystemWork {
    private HashMap<String, Student> studentHashMap = new HashMap<>();

    public SystemWorkStudent() {
        super();
        //defaultStudentCourseGroup();
        defaultContainStudent();
    }

    /**
     * check the userName(ID) and password's Student
     *
     * @param userName is a String
     */
    public void loginStudent(String userName) {
        System.out.println("You Are Login the System");
        studentHashMap.get(userName).showMenuStudent();
    }

    /**
     * This method show all of th eStudents
     */
    public void showStudents() {
        System.out.println(studentHashMap.toString());
        System.out.println("\n");
    }

    public void defaultContainStudent() {
        for (int i = 1; i <= 20; i++) {
            studentHashMap.put("99217" + (i + 10), new Student("Student" + i, "pass" + i, "99217" + (i + 10)));
        }
    }

    /**
     * in this method we define default Class Students
     */
    public void defaultStudentCourseGroup() {
        studentHashMap.get("99217"+ 11).getCourseGroupChosenHashSet().add(new CourseGroup("math2", 201));
        studentHashMap.get("9921711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 501));
        studentHashMap.get("9922711").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 102));
        studentHashMap.get("9922711").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 302));
        studentHashMap.get("9923711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 501));
        studentHashMap.get("9923711").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 801));
        studentHashMap.get("9924711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 903));
        studentHashMap.get("9924711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 502));
        studentHashMap.get("9925711").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 202));
        studentHashMap.get("9925711").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 102));
        studentHashMap.get("9926711").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringMathematics", 601));
        studentHashMap.get("9926711").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringProbability", 701));
        studentHashMap.get("9927711").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 301));
        studentHashMap.get("9927711").getCourseGroupChosenHashSet().add(new CourseGroup("physics2", 401));
        studentHashMap.get("9928711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 901));
        studentHashMap.get("9928711").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 801));
        studentHashMap.get("9929711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 501));
        studentHashMap.get("9929711").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 103));
        studentHashMap.get("9930711").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 202));
        studentHashMap.get("9930711").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringProbability", 702));
        studentHashMap.get("9931711").getCourseGroupChosenHashSet().add(new CourseGroup("physics2", 402));
        studentHashMap.get("9931711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 903));
        studentHashMap.get("9932711").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 802));
        studentHashMap.get("9932711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 901));
        studentHashMap.get("9933711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 502));
        studentHashMap.get("9933711").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 302));
        studentHashMap.get("9934711").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 302));
        studentHashMap.get("9934711").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringMathematics", 602));
        studentHashMap.get("9935711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 502));
        studentHashMap.get("9935711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 902));
        studentHashMap.get("9936711").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 802));
        studentHashMap.get("9936711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 901));
        studentHashMap.get("9937711").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 301));
        studentHashMap.get("9937711").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 201));
        studentHashMap.get("9938711").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 902));
        studentHashMap.get("9938711").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 203));
        studentHashMap.get("9939711").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 203));
        studentHashMap.get("9939711").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 501));
        studentHashMap.get("9940711").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 101));
        studentHashMap.get("9940711").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringProbability", 701));
        studentHashMap.get("9940711").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 101));
    }

    /**
     * Show Student Classes
     */
    public void showStudentClasses() {
        defaultStudentCourseGroup();
        System.out.println("Please Enter Student ID:");
        String id = input.nextLine();
        for (int i = 0; i < studentHashMap.get(id).getCourseGroupChosenHashSet().size(); i++) {
            System.out.println(studentHashMap.get(id).getCourseGroupChosenHashSet());
        }
    }

    public void selectUnit() {

    }

    public void message() {

    }

    public HashMap<String, Student> getStudentHashMap() {
        return studentHashMap;
    }

    public void setStudentHashMap(HashMap<String, Student> studentHashMap) {
        this.studentHashMap = studentHashMap;
    }

    @Override
    public String toString() {
        return "SystemWorkStudent{" +
                "studentHashMap=" + studentHashMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemWorkStudent that = (SystemWorkStudent) o;
        return Objects.equals(studentHashMap, that.studentHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentHashMap);
    }
}
