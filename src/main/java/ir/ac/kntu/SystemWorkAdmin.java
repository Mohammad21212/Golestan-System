package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import static ir.ac.kntu.Global.*;


public class SystemWorkAdmin extends SystemWork {
    private HashMap<String, Admin> adminHashMap = new HashMap<>();

    public SystemWorkAdmin() {
        defaultContainAdmin();
    }

    /**
     * check the userName & password's Admin
     *
     * @param userName a String
     */
    public void loginAdmin(String userName) {
        System.out.println("You Are Login the System");
        adminHashMap.get(userName).showMenuAdmin();
    }

    public void defaultContainAdmin() {
        adminHashMap.put("Admin", new Admin("Admin", "PasswordAdmin"));
    }

    /**
     * Definition Student by Admin by ID's Student
     */
    public void generateStudent() {
        System.out.println("Please Enter A Name For Student:");
        String name = input.nextLine();
        System.out.println("Please Enter An Id For Student:");
        String id = input.nextLine();
        System.out.println("Please Enter A password For Student: ");
        String password = input.nextLine();
        SYSTEM_WORK_STUDENT.getStudentHashMap().put(id, new Student(name, password, id));
        System.out.println("The new Student added to Students.");
    }

    /**
     * Definition Professor by Admin by ID's Professor
     */
    public void generateProfessor() {
        System.out.println("Please Enter A Name For Professor:");
        String name = input.nextLine();
        System.out.println("Please Enter An Id For Professor:");
        String id = input.nextLine();
        System.out.println("Please Enter A password For Professor: ");
        String password = input.nextLine();
        SYSTEM_WORK_PROFESSOR.getProfessorHashMap().put(id, new Professor(name, password, id));
        System.out.println("The new Professor added to Professors.");
    }

    /**
     * Select Unit for Students
     */
    public void selectUnit() {

    }

    public HashMap<String, Admin> getAdminHashMap() {
        return adminHashMap;
    }

    public void setAdminHashMap(HashMap<String, Admin> adminHashMap) {
        this.adminHashMap = adminHashMap;
    }

    @Override
    public String toString() {
        return "SystemWorkAdmin{" +
                "adminHashMap=" + adminHashMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SystemWorkAdmin that = (SystemWorkAdmin) o;
        return Objects.equals(adminHashMap, that.adminHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminHashMap);
    }
}
