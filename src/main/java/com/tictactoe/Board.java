package com.tictactoe;

public class Board {
    private String[] gameBoard;

    public Board(String[] gameBoard) { //konstruktor parametrowy alt insert, czyli w nawiasach jest przekazany parametr String
    this.gameBoard = gameBoard; //utworzona metoda ponizej w 10w, a w 7 zostala ta metoda wywolana
    }

    public void inicjalize() {
        for (int i=0; i< gameBoard.length; i++) {
            gameBoard[i] = " ";
        }
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("| " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + " | ");
        System.out.println("-------------");
        System.out.println("| " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + " | ");
        System.out.println("-------------");
        System.out.println("| " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + " | ");
        System.out.println("-------------");

    }
}
