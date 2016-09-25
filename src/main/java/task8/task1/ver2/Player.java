package task8.task1.ver2;

public class Player {
    private static String name;
    private static int age;
    private char type;

    public Player (String name, int age, char type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public char getType(){
        return type;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }
}
