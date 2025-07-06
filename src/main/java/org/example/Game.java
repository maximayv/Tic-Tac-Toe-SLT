package org.example;

public class Game {
    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    public Game() {
        resetBoard();
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            return true;
        }
        return false;
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print("[" + cell + "]");
            }
            System.out.println();
        }
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
