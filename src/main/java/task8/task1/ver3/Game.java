package task8.task1.ver3;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
       StartGame startGame = new StartGame();
       TicTacToe ticTacToe = new TicTacToe(startGame.getPlayerFirst(), startGame.getPlayerSecond(), startGame.getBoard());

       WinnerAndLoser win = new WinnerAndLoser(ticTacToe.winner, "win");
       WinnerAndLoser lose = new WinnerAndLoser(ticTacToe.playerFirst, "lose");

       if (ticTacToe.winner.equals(ticTacToe.playerFirst)) lose = new WinnerAndLoser(ticTacToe.playerSecond, "lose");


       StatisticsOfResults.addStatistics(win);
       StatisticsOfResults.addStatistics(lose);

       showStatistic ();
    }

    public static void showStatistic (){
        System.out.println("Do you want to print statistics? (type: yes or no)");
        Scanner sc1 = new Scanner(System.in);
        String answer = sc1.nextLine();
        if (answer.equals("yes")){
            StatisticsOfResults.printStatistics();
        }
    }
}
