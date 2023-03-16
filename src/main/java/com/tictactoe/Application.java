package com.tictactoe;

public class Application {
    public static void main(String[] args) {
        System.out.println("\n Welcome to 3x3 Tic Tac Toe game !");
        Board board = new Board(new String[9]);
        board.inicjalize();
        board.print();




    }

}