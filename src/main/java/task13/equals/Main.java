package task13.equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("James", 19, "New York");
        Student student2 = new Student("Frank", 19, "New York");
        Student student3 = new Student("James", 18, "Los Angeles");
        Student student4 = new Student("Bob", 20, "Miami");
        Student student5 = new Student("Bob", 20, "Miami");

        boolean result = student4.equals1(student5);
        System.out.println(result);

        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);


        Collections.sort(list, new StudentComparator());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new StudentComparatorCity());
        System.out.println(list);



    }

}
