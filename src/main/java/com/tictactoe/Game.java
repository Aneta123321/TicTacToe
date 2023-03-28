package com.tictactoe;

import com.tictactoe.exception.WinnerException;

public class Game {
    private Board board;

    private boolean isFinish = false;

    public Game(Board board) {
        this.board = board;
    }

    public void start() { // tworze metode start
        do {
            board.printBoard();
        } while (!isFinish);
    }

    public void checkWin(String[][] actualBoard) throws
            WinnerException {
        checkResultForRows(actualBoard);
        checkResultForColumns(actualBoard);
        checkResultForCross(actualBoard);
    }

    private void checkResultForRows(String[][] actualBoard) throws WinnerException { // petla sprawdza po wierszach
        for (int i = 0; i < board.getGameType().x; i++) {
            String rowResult = new String();
            for (int j = 0; j < board.getGameType().y; j++) {
                rowResult += actualBoard[i][j];
            }
            checkWinner(rowResult);

        }
    }

    private void checkResultForColumns(String[][] actualBoard) throws WinnerException {
        for (int j = 0; j < board.getGameType().y; j++) {
            String columnResult = new String();
            for (int i = 0; i < board.getGameType().x; i++) {
                columnResult += actualBoard[i][j];
            }
            checkWinner(columnResult);

        }
    }

    private void checkResultForCross(String[][] actualBoard) throws WinnerException {
        String crossResultLeftDown = new String();
        for (int i = 0, j = 0; i < board.getGameType().x && j < board.getGameType().y; i++, j++) {
            crossResultLeftDown += actualBoard[i][j];

        }
        checkWinner(crossResultLeftDown);

        String crossResultLeftUp = new String();
        for (int i = board.getGameType().x - 1, j = 0; i >= 0 && j < board.getGameType().y; i--, j++) {
            crossResultLeftUp += actualBoard[i][j];
        }
        checkWinner(crossResultLeftUp);
    }

    private void checkWinner(String result) throws WinnerException { // metoda sprawdzenie wygranego i wyjatek
        int repeatableNumber = board.getGameType().x <= 5 ? board.getGameType().x : 5;
        if (result.contains("O".repeat(repeatableNumber))) {
            this.isFinish = true; //koniec gry na true
            throw new WinnerException("THE WINNER IS \"O\"!!!");
        } else if (result.contains("X".repeat(repeatableNumber))) {
            this.isFinish = true;
            throw new WinnerException("THE WINNER IS \"X\"!!!");
        }
    }
}




