package com.tictactoe;

import com.tictactoe.exception.InvalidValue;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    String[] menuOptions = {
            "1. Game with another human, game type 3x3",
            "2. Game with another human, game type 10x10",
            "3. Game with a computer, game type 3x3",
            "4. Game with a computer, game type 10x10",
            "5. Exit"};

    public void printMenu() {
        for (String option : menuOptions) {
            System.out.println(option);
        }
        System.out.print("Choose your option: ");
        Scanner scanner = new Scanner(System.in); //nowy obiekt scanner utw i mozna zczytac to co jest wpisane z klawiatury
        int option = 0;
        while (option <= 0 || option > menuOptions.length) {
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1 -> startGame(OpponentType.HUMAN, GameType.BOARD3x3);
                    case 2 -> startGame(OpponentType.HUMAN, GameType.BOARD10x10);
                    case 3 -> startGame(OpponentType.COMPUTER, GameType.BOARD3x3);
                    case 4 -> startGame(OpponentType.COMPUTER, GameType.BOARD10x10);
                    case 5 -> exit(0);
                    default -> throw new InvalidValue();
                }
            } catch (Exception ex) {
                System.out.println("Please enter valid value between 1 and " + menuOptions.length);
                scanner.next();
            }
        }
    }

    private void startGame(OpponentType opponentType, GameType gameType) {
        Board board = new Board(opponentType, gameType); //nowy obiekt pod nazwa tablica
        Game game = new Game(board);
         game.start();
    }
    }
