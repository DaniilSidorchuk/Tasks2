package task8.task1.ver2;

/**
 * Created by Даня on 18.09.2016.
 */
public class Board {
    public static final int BOARD_SIZEi = 3;
    public static final int BOARD_SIZE = 3;
    private char [][] board;

    Player playerFirst;
    Player playerSecond;

    Player currentPlayer;

    Player winner;

    public Board(Player playerFirst, Player playerSecond, Player currentPlayer){
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZEi][BOARD_SIZE];
        fillboard();
    }

    public boolean makemove(String move) {
       if (validateMove(move)) {
           return false;
       }

           int i = move.charAt(0);
           int j = move.charAt(1);

           board[i][j] = currentPlayer.getType();
        changePlayer();
        return true;


    }

    private void changePlayer() {
        if (currentPlayer == playerFirst){
            currentPlayer = playerSecond;
        }else {
            currentPlayer = playerFirst;
        }
    }

    private boolean validateMove(String move){
        //// TODO: 18.09.2016 write conditions 
        return true;

    }

    private void findWinner(){
        //todo calculate who winner correctly
        winner = playerFirst;
    }

    public boolean gameFinished(){
        //// TODO: 18.09.2016  finish the function
        if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x'){
        return true;}
        return false;
    }

    public void fillboard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(){
        //// TODO: 18.09.2016 add symbols to show board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
    }

    public Player gerWinner(){
        return winner;
    }
}
