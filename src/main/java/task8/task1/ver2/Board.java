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
       if (!validateMove(move)) {
           return false;
       }

           char i1 = move.charAt(0);
           char j1 = move.charAt(1);

           int i2 = Character.digit(i1, 10);
           int j2 = Character.digit(j1, 10);

           board[i2][j2] = currentPlayer.getType();
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
        if (move == "00" && board[0][0] == ' ' || move == "01" && board[0][1] == ' ' || move == "02" && board[0][2] == ' '  || move == "10" && board[1][0] == ' '  || move == "11" && board[1][1] == ' '  || move == "12" && board[1][2] == ' '  || move == "20" && board[2][0] == ' '  || move == "21" && board[2][1] == ' '  || move == "22"  && board[2][2] == ' ' ) {
            return true;
        }else return false;

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
                System.out.print("|" + board[i][j] + "|");
            }
            System.out.println();

        }
    }

    public Player gerWinner(){
        findWinner();
        return winner;
    }
}
