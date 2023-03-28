package com.tictactoe;

public enum GameType {
    BOARD3x3(3, 3),  //enumy
    BOARD10x10(10, 10);

    public final int x;
    public final int y;

    GameType(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
