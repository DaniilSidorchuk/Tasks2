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
           return true;
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
        if (move == "00" || move == "01" || move == "02" || move == "10" || move == "11" || move == "12" || move == "20" || move == "21" || move == "22") {
            return true;
        }else return false;

    }

    private void findWinner() {
        if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') {
            winner = playerFirst;
        }
        if (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') {
            winner = playerSecond;
        }
        if (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x') {
            winner = playerFirst;
        }
        if (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o') {
            winner = playerSecond;
        }
        if (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x') {
            winner = playerFirst;
        }
        if (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o') {
            winner = playerSecond;
        }
        if (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x') {
            winner = playerFirst;
        }
        if (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o') {
            winner = playerSecond;
        }
        if (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x') {
            winner = playerFirst;
        }
        if (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o') {
            winner = playerSecond;
        }
        if (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x') {
            winner = playerFirst;
        }
        if (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o') {
            winner = playerSecond;
        }
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
            winner = playerFirst;
        }
        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
            winner = playerSecond;
        }
        if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
            winner = playerFirst;
        }
        if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
            winner = playerSecond;
        }
    }

    public boolean gameFinished() {
        if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' && board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' && board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' '){
            return true;
        }else return false;

    }

    public void fillboard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + "|");
            }
            System.out.println();

        }
    }

    public Player gerWinner(){
        return winner;
    }
}
