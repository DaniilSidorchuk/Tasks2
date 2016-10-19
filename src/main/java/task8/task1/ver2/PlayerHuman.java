package task8.task1.ver2;

/**
 * Created by Даня on 18.10.2016.
 */
public class PlayerHuman implements Player {

    private String name;
    private int age;
    private char type;

    public PlayerHuman(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public char getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
