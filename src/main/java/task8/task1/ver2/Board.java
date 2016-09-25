package task8.task1.ver2;


public class Board {
    public static final int BOARD_SIZEi = 3;
    public static final int BOARD_SIZE = 3;
    private char [][] board;

    Player playerFirst;
    Player playerSecond;

    Player currentPlayer;

    Player winner;

    public Board(Player playerFirst, Player playerSecond){
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZEi][BOARD_SIZE];
        fillboard();
    }

    public boolean makeMove(String move) {

           char i1 = move.charAt(0);
           char j1 = move.charAt(1);

           int i = Character.digit(i1, 10);
           int j = Character.digit(j1, 10);

        if (!validateMove(i, j)) {
            return false;
        }
           board[i][j] = currentPlayer.getType();
        if (!gameFinished()){
        changePlayer();}
        return true;
    }

    private void changePlayer() {
        if (currentPlayer == playerFirst){
            currentPlayer = playerSecond;
        }else {
            currentPlayer = playerFirst;
        }
    }

    private boolean validateMove(int i, int j){
        if (i>2 || i<0){
            return false;
        }
        if (j>2 || j<0){
            return false;
        }
        if (board[i][j] == ' '){
            return true;
        }
        return false;
    }

    private void findWinner() {
        if (board[0][0] == currentPlayer.getType() && board[0][1] == currentPlayer.getType() && board[0][2] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[1][0] == currentPlayer.getType() && board[1][1] == currentPlayer.getType() && board[1][2] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[2][0] == currentPlayer.getType() && board[2][1] == currentPlayer.getType() && board[2][2] == currentPlayer.getType()) {
            winner = currentPlayer;
        }
        if (board[0][0] == currentPlayer.getType() && board[1][0] == currentPlayer.getType() && board[2][0] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[0][1] == currentPlayer.getType() && board[1][1] == currentPlayer.getType() && board[2][1] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[0][2] == currentPlayer.getType() && board[1][2] == currentPlayer.getType() && board[2][2] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[0][0] == currentPlayer.getType() && board[1][1] == currentPlayer.getType() && board[2][2] == currentPlayer.getType()) {
            winner = currentPlayer;
        }

        if (board[0][2] == currentPlayer.getType() && board[1][1] == currentPlayer.getType() && board[2][0] == currentPlayer.getType()) {
            winner = currentPlayer;
        }
           }

    public boolean gameFinished() {
        getWinner();
        if (winner != null){
            return  true;}
        if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' && board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' && board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' '){
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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print("|" + board[i][j] + "|");
            }
            System.out.println();

        }
    }

    public Player getWinner(){
        findWinner();
        return winner;
    }
}
