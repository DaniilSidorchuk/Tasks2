package task13.equals;


import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare (Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public int compareCity (Student student1, Student student2){
        return student1.getCity().compareTo(student2.getCity());
    }


}
