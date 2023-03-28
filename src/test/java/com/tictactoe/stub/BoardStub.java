package com.tictactoe.stub;

import com.tictactoe.Board;
import com.tictactoe.GameType;
import com.tictactoe.OpponentType;

public class BoardStub extends Board {
    public BoardStub(OpponentType opponentType, GameType gameType) {
        super(opponentType, gameType);
    }

    public Board initializeBoard3x3WinColumnX() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "X"; gameBoard[0][1] = "O"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "X"; gameBoard[1][1] = "O"; gameBoard[1][2] = "X";
        gameBoard[2][0] = "X"; gameBoard[2][1] = "X"; gameBoard[2][2] = "O";
        this.setGameBoard(gameBoard);
        return this;
    }
    // stub - zaslepka dla klasy Board

    public Board initializeBoard3x3WinColumnO() { // tablica dwuwymiarowa
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "X"; gameBoard[0][1] = "O"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "O"; gameBoard[1][1] = "O"; gameBoard[1][2] = "X";
        gameBoard[2][0] = "X"; gameBoard[2][1] = "O"; gameBoard[2][2] = "O";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3WinRowX() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "X"; gameBoard[0][1] = "O"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "X"; gameBoard[1][1] = "X"; gameBoard[1][2] = "X";
        gameBoard[2][0] = "O"; gameBoard[2][1] = "X"; gameBoard[2][2] = "O";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3WinRowO() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "O"; gameBoard[0][1] = "O"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "X"; gameBoard[1][1] = "X"; gameBoard[1][2] = "O";
        gameBoard[2][0] = "O"; gameBoard[2][1] = "X"; gameBoard[2][2] = "X";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3WinCrossX() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "X"; gameBoard[0][1] = "O"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "O"; gameBoard[1][1] = "X"; gameBoard[1][2] = "O";
        gameBoard[2][0] = "O"; gameBoard[2][1] = "X"; gameBoard[2][2] = "X";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3WinCrossO() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "O"; gameBoard[0][1] = "X"; gameBoard[0][2] = "O";
        gameBoard[1][0] = "X"; gameBoard[1][1] = "O"; gameBoard[1][2] = "O";
        gameBoard[2][0] = "O"; gameBoard[2][1] = "X"; gameBoard[2][2] = "X";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3NoWinner() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "O"; gameBoard[0][1] = "X"; gameBoard[0][2] = "X";
        gameBoard[1][0] = "X"; gameBoard[1][1] = "O"; gameBoard[1][2] = "O";
        gameBoard[2][0] = "O"; gameBoard[2][1] = "X"; gameBoard[2][2] = "X";
        this.setGameBoard(gameBoard);
        return this;
    }

    public Board initializeBoard3x3WrongMove() {
        String[][] gameBoard = new String[3][3];
        gameBoard[0][0] = "O"; gameBoard[0][1] = " "; gameBoard[0][2] = "O";
        gameBoard[1][0] = " "; gameBoard[1][1] = "X"; gameBoard[1][2] = " ";
        gameBoard[2][0] = "O"; gameBoard[2][1] = " "; gameBoard[2][2] = "X";
        this.setGameBoard(gameBoard);
        return this;
    }
}


