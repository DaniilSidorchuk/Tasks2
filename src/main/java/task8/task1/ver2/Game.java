package task8.task1.ver2;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player playerFirst = new Player("Bob", 25, 'x');
        Player playerSecond = new Player("Mike", 35, 'o');


        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished()){
            String move = getMoveFromConsole(scanner);
            board.makeMove(move);
            board.printBoard();

        }

        Player player = board.getWinner();
        System.out.println("Congratulations");
        System.out.println("Winner is " + player.getName() + " " + player.getAge());
    }

    private static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves ...");
        System.out.println("Enter move: ");
        return scanner.nextLine();
    }
}
