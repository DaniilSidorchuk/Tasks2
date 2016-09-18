package task8.task1;


import java.util.Scanner;

public class Task8_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = new char [3][3];

        char currentPlayer = 'X';

        while (gameFinished(board)){
            System.out.println("Player " + currentPlayer + " moves ...");
            System.out.println("Enter move: ");
            String move = scanner.next();
            boolean result = makemove(move, currentPlayer, board);
            if (result){
                if (currentPlayer == 'X'){
                    currentPlayer = 'O';
                }else {
                    currentPlayer = 'X';
                }
            }
            printBoard(board);
        }
        char winner = calculateWinner(board);
    }

    private static void printBoard(char[][] board) {

    }

    private static char calculateWinner(char[][] board) {
        return 'X';
    }

    private static boolean makemove(String move, char currentPlayer, char[][] board) {
        int i = move.charAt(0);
        int j = move.charAt(1);

        board [i][j] = currentPlayer;

        return true;
    }

    private static boolean gameFinished(char[][] board) {
        return false;
    }

    public static void fillboard(char [][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }
}
