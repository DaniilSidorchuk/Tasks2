package task13.equals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("James", 19);
        Student student2 = new Student("Frank", 19);
        Student student3 = new Student("James", 18);
        Student student4 = new Student("Bob", 20);
        Student student5 = new Student("Bob", 20);

        student1.setCity(City.city1);
        student2.setCity(City.city1);
        student3.setCity(City.city1);
        student4.setCity(City.city2);
        student5.setCity(City.city3);

        boolean result = student4.equals(student5);
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

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        });
        System.out.println(list);




    }

}
