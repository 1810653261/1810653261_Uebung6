package Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Aufruf {
    public static void main(String[] args) {
        List<Student> Student = new ArrayList<>();
        Student.add(new Student("Alex", 1810653261, 2018));
        Student.add(new Student("Alexander", 1223456789, 2022));
        Student.add(new Student("Lothar", 12345678, 2034));

        for(Student a : Student){
            System.out.println(a.toString());
        }
    }
}
