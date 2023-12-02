package ir.ac.kntu;

import java.util.HashMap;
import java.util.Objects;

public class SystemWorkProfessor extends SystemWork {
    private HashMap<String, Professor> professorHashMap = new HashMap<>();

    public SystemWorkProfessor() {
        super();
        defaultContainProfessor();
        //defaultProfessorCourseGroup();
    }

    /**
     * check the userName(ID) and password's Professor
     *
     * @param userName is a String
     */
    public void loginProfessor(String userName) {
        System.out.println("You Are Login the System");
        professorHashMap.get(userName).showMenuProfessor();
    }


    public void defaultContainProfessor() {
        for (int i = 0; i < 20; i++) {
            professorHashMap.put("1001" + i, new Professor("1001" + i,  "password" + i));
        }
    }

    /**
     * in this method we define default Class Professors
     */
    public void defaultProfessorCourseGroup() {
        professorHashMap.get("10010").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 201));
        professorHashMap.get("10011").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 102));
        professorHashMap.get("10012").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 501));
        professorHashMap.get("10013").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 903));
        professorHashMap.get("10014").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 202));
        professorHashMap.get("10015").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringProbability", 701));
        professorHashMap.get("10017").getCourseGroupChosenHashSet().add(new CourseGroup("physics2", 401));
        professorHashMap.get("10018").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 801));
        professorHashMap.get("10019").getCourseGroupChosenHashSet().add(new CourseGroup("math1", 103));
        professorHashMap.get("10110").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringProbability", 702));
        professorHashMap.get("10111").getCourseGroupChosenHashSet().add(new CourseGroup("physics2", 402));
        professorHashMap.get("10112").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 901));
        professorHashMap.get("10113").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 302));
        professorHashMap.get("10114").getCourseGroupChosenHashSet().add(new CourseGroup("engineeringMathematics", 602));
        professorHashMap.get("10115").getCourseGroupChosenHashSet().add(new CourseGroup("AP", 502));
        professorHashMap.get("10116").getCourseGroupChosenHashSet().add(new CourseGroup("dataStructure", 802));
        professorHashMap.get("10117").getCourseGroupChosenHashSet().add(new CourseGroup("physics1", 301));
        professorHashMap.get("10118").getCourseGroupChosenHashSet().add(new CourseGroup("technicalLanguage", 902));
        professorHashMap.get("10119").getCourseGroupChosenHashSet().add(new CourseGroup("math2", 203));
    }

    /**
     * Show Professor Classes
     */
    public void showProfessorClasses() {
        //defaultProfessorCourseGroup();
        System.out.println("Please Enter Professor ID:");
        String id = input.nextLine();
        for (int i = 0; i < professorHashMap.get(id).getCourseGroupChosenHashSet().size(); i++) {
            System.out.println(professorHashMap.get(id).getCourseGroupChosenHashSet());
        }
    }

    public void showProfessor() {
        System.out.println(professorHashMap.toString());
    }


    public HashMap<String, Professor> getProfessorHashMap() {
        return professorHashMap;
    }

    public void setProfessorHashMap(HashMap<String, Professor> professorHashMap) {
        this.professorHashMap = professorHashMap;
    }

    @Override
    public String toString() {
        return "SystemWorkProfessor{" +
                "professorHashMap=" + professorHashMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemWorkProfessor that = (SystemWorkProfessor) o;
        return Objects.equals(professorHashMap, that.professorHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professorHashMap);
    }
}
