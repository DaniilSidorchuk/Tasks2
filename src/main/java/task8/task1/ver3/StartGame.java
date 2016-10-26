package task8.task1.ver3;

import java.util.Scanner;

public class StartGame {

    private Player playerFirst;
    private Player playerSecond;
    private Board board;
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Scanner sc5 = new Scanner(System.in);

    public StartGame(){
        System.out.println("Player first");
        System.out.println("Please enter your name: ");
        String name1 = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age1 = sc1.nextInt();
        System.out.println("Please choose your side (x or o)");
        String type11 = sc2.nextLine() + "aaa";
        char type1 = type11.charAt(0);

        System.out.println("Player second");
        System.out.println("Please enter your name: ");
        String name2 = sc3.nextLine();
        System.out.println("Please enter your age: ");
        int age2 = sc4.nextInt();
        System.out.println("Please choose your side (x or o)");
        String type22 = sc5.nextLine() + "aaa";
        char type2 = type22.charAt(0);

        playerFirst = new PlayerHuman(name1, age1, type1);
        playerSecond = new PlayerHuman(name2, age2, type2);

        board = new Board();

    }

    public Player getPlayerFirst() {
        return playerFirst;
    }

    public Player getPlayerSecond() {
        return playerSecond;
    }

    public Board getBoard() {
        return board;
    }
}
