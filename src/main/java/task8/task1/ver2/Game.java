package task8.task1.ver2;

import java.util.Scanner;

/**
 * Created by Даня on 18.09.2016.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player playerFirst = new Player("Bob", 25, 'x');
        Player playerSecond = new Player("Mike", 35, 'o');

        Board board = new Board(playerFirst, playerSecond, playerFirst);

        while (board.gameFinished()){
            String move = getMoveFromConsole(scanner);
            board.makemove(move);
            board.printBoard();

        }
        Player player = board.gerWinner();
        System.out.println(player.getName() + " " + player.getAge());
    }

    private static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves ...");
        System.out.println("Enter move: ");
        return scanner.next();
    }
}
