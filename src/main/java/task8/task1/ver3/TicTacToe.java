package task8.task1.ver3;

import java.util.Scanner;

public class TicTacToe {

    Player playerFirst;
    Player playerSecond;
    Player currentPlayer;
    Player winner;
    Board board;

    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);

    public TicTacToe(Player playerFirst, Player playerSecond, Board board) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
        this.currentPlayer = playerFirst;
        this.board = board;

        while (!gameFinished()){
            makeMove();
            board.printBoard();
        }
        winner = getWinner();

        System.out.println("GAME IS OVER");
        System.out.println("Winner is" + " " + winner.getName() + " " + winner.getAge() + " " + "years old");

    }


    public boolean makeMove(){
        String move = getMoveFromConsole();
        char i1 = move.charAt(0);
        char j1 = move.charAt(1);

        int i = Character.digit(i1, 10);
        int j = Character.digit(j1, 10);

        if (!validateMove(i, j)) {
            return false;
        }
        board.setBoard(i, j,currentPlayer.getType());
        if (!gameFinished()){
            changePlayer();}
        return true;
    }

    private boolean gameFinished() {
        getWinner();
        if (winner != null){
            return  true;}
        for (int i = 0; i <board.getBOARD_SIZEi() ; i++) {
            for (int j = 0; j <board.getBOARD_SIZE() ; j++) {
                if (board.getBoard(i,j)== ' ')return false;
            }
        }
        return false;
    }

    private Player getWinner() {
        findWinner();
        return winner;
    }

    private void findWinner() {
        if (board.getBoard(0,0) == currentPlayer.getType() && board.getBoard(0,1) == currentPlayer.getType() && board.getBoard(0,2) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(1,0) == currentPlayer.getType() && board.getBoard(1,1) == currentPlayer.getType() && board.getBoard(1,2) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(2,0) == currentPlayer.getType() && board.getBoard(2,1) == currentPlayer.getType() && board.getBoard(2,2) == currentPlayer.getType()) {
            winner = currentPlayer;
        }
        if (board.getBoard(0,0) == currentPlayer.getType() && board.getBoard(1,0) == currentPlayer.getType() && board.getBoard(2,0) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(0,1) == currentPlayer.getType() && board.getBoard(1,1) == currentPlayer.getType() && board.getBoard(2,1) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(0,2) == currentPlayer.getType() && board.getBoard(1,2) == currentPlayer.getType() && board.getBoard(2,2) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(0,0) == currentPlayer.getType() && board.getBoard(1,1) == currentPlayer.getType() && board.getBoard(2,2) == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board.getBoard(0,2) == currentPlayer.getType() && board.getBoard(1,1) == currentPlayer.getType() && board.getBoard(2,0) == currentPlayer.getType()) {
            winner = currentPlayer;
        }
    }

    public String getMoveFromConsole(){
        System.out.println("Player " + currentPlayer.getName() + " moves");
        System.out.println("Enter your move please");
        return sc.nextLine();
    }

    private void changePlayer() {
        if (currentPlayer == playerFirst){
            currentPlayer = playerSecond;
        }else {
            currentPlayer = playerFirst;
        }
    }

    private boolean validateMove(int i, int j) {

        if (i>2 || i<0){
            return false;
        }
        if (j>2 || j<0){
            return false;
        }
        if (board.getBoard(i, j) == ' '){
            return true;
        }
        return false;
    }



}
