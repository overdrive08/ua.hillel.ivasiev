package ua.hillel.ivasiev.lesson10;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student ivan = new Student();
        Student petya = new Student();

        List<Student> group = new ArrayList();
        group.add(ivan);
        group.add(petya);

        for (int i = 0; i < group.size(); i++) {
            group.get(i).greet();
        }
    }
}
