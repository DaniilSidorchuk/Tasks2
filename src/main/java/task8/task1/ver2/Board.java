package task8.task1.ver2;


public class Board {
    public static final int BOARD_SIZEi = 3;
    public static final int BOARD_SIZE = 3;
    private char [][] board;


    public Board(){
        board = new char[BOARD_SIZEi][BOARD_SIZE];
        fillboard();
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


    public int getBOARD_SIZEi(){
        return BOARD_SIZEi;
    }
    public int getBOARD_SIZE(){
        return BOARD_SIZE;
    }

    public char getBoard(int i, int j) {
        return board[i][j];
    }

    public void setBoard(int i, int j, char type) {
        board[i][j] = type;
    }


}
