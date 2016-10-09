package task13.equals;

public class Student implements Comparable <Student> {

    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public boolean equals1 (Object ob){

        if (ob == null || ob.getClass() != Student.class) return false;
        Student student = (Student) ob;

        if (this.name == null || this.city == null) return false;
        boolean nameResult = this.name.equals(student.name);
        boolean ageResult = this.age == student.age;
        boolean cityResult = this.city.equals(student.city);

        return nameResult && ageResult && cityResult;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }

    public String toString(){
        return this.name + " " + this.age + " years old from " + this.city;
    }
}
