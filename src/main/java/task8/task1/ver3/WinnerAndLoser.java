package task8.task1.ver3;


public class WinnerAndLoser implements Player {

   private String name;
    private int age;
    private int wins = 0;
    private int loses = 0;



    public  WinnerAndLoser(Player player, String result) {
        this.name = player.getName();
        this.age = player.getAge();
        if (result.equals("win")){
            this.wins++;
        }else this.loses++;
        }


    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getWins() {

        return wins;
    }

    public int getLoses() {
        return loses;
    }

    @Override
    public char getType() {
        return 0;
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
