package task8.task1.ver2;

public class AI implements Player {

    private final String name = "Computer";
    private final int age = 99;
    private char type;

    public AI(char type) {
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
