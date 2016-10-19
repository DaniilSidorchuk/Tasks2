package task8.task1.ver2;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
       StartGame startGame = new StartGame();
       TicTacToe ticTacToe = new TicTacToe(startGame.getPlayerFirst(), startGame.getPlayerSecond(), startGame.getBoard());
    }
}
