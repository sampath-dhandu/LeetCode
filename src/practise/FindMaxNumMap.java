package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMaxNumMap {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Map<String, Integer> grades = new HashMap<String, Integer>();
        grades.put("Alogoritham", 90);
        grades.put("GEO", 20);
        grades.put("math", 30);
        Student student = new Student("gowtham", "dhandu", "Computers", grades);
        Map<String, Integer> grades1 = new HashMap<String, Integer>();
        grades1.put("DS", 40);
        grades1.put("GEO", 20);
        grades1.put("math", 30);
        Student student1 = new Student("vihaan", "dhandu", "Math", grades1);
        Map<String, Integer> grades2 = new HashMap<String, Integer>();
        grades2.put("DS", 40);
        grades2.put("GEO", 20);
        grades2.put("math", 30);
        Student student2 = new Student("swapna", "dhandu", "Science", grades2);
        Map<String, Integer> grades3 = new HashMap<String, Integer>();
        grades3.put("DS", 98);
        grades3.put("GEO", 10);
        grades3.put("math", 40);
        Student student3 = new Student("sampath", "dhandu", "Computers", grades3);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        int max = findMaxNum(studentList, "Computers");
        System.out.println(max);
    }


    private static int findMaxNum(List<Student> studentList, String major) {
        return studentList.stream().
                filter(student -> major.equalsIgnoreCase(student.getMajor())).
                flatMap(student -> student.getGrades().values().stream()).
                max(Integer::compareTo).orElseGet(() -> 0);
    }

}


class Student {

    private String firstName;
    private String lastName;
    private String major;
    private Map<String, Integer> grades;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Student(String firstName, String lastName, String major, Map<String, Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.grades = grades;


    }
}