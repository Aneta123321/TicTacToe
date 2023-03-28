package com.tictactoe;

import com.tictactoe.exception.WinnerException;
import com.tictactoe.stub.BoardStub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.Assert;


class GameTest {

    @Test
    @DisplayName("Testy weryfikujące zwycięstwa O w wierszach.")
    void check3x3WinRowO() {
     BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
    boardStub.initializeBoard3x3WinRowO();
    Game game = new Game(boardStub);
        WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
        Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"O\"!!!")); // equals porownuje Stringi
    }

    @Test
    @DisplayName("Testy weryfikujące zwycięstwa O w kolumnach.")
    void check3x3WinColumnO() {
        BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
        boardStub.initializeBoard3x3WinColumnO();
        Game game = new Game(boardStub);
        WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
        Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"O\"!!!")); // equals porownuje Stringi
    }
@Test
@DisplayName("Testy weryfikujące zwycięstwa O po przekątnych planszy.")
        void check3x3Diagonal0() {
    BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
    boardStub.initializeBoard3x3WinCrossO();
    Game game = new Game(boardStub);
    WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
    Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"O\"!!!"));
}

@Test
    @DisplayName("Testy weryfikujące zwycięstwa X w wierszach.")
        void check3x3WinRowX() {
    BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
    boardStub.initializeBoard3x3WinRowX();
    Game game = new Game(boardStub);
    WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
    Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"X\"!!!"));
}

    @Test
    @DisplayName("Testy weryfikujące zwycięstwa X w kolumnach.")
    void check3x3WinColumns() {
        BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
        boardStub.initializeBoard3x3WinColumnX();
        Game game = new Game(boardStub);
        WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
        Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"X\"!!!"));
    }
    @Test
    @DisplayName("Testy weryfikujące zwycięstwa X w wierszach.")
    void check3X3WinRow() {
        BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
        boardStub.initializeBoard3x3WinRowX();
        Game game = new Game(boardStub);
        WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
        Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"X\"!!!"));
    }



    @Test
    @DisplayName("Testy weryfikujące zwycięstwa X po przekatnych planszy")
    void check3X3WinDiagonalX() {
        BoardStub boardStub = new BoardStub(OpponentType.HUMAN, GameType.BOARD3x3);
        boardStub.initializeBoard3x3WinCrossX();
        Game game = new Game(boardStub);
        WinnerException exception = Assert.assertThrows(WinnerException.class, () -> game.checkWin(boardStub.getGameBoard()));
        Assert.assertTrue(exception.getExceptionMessage().equals("THE WINNER IS \"X\"!!!"));
    }

   /*
    Napisz testy weryfikujące układy, które prowadzą do remisu.
    Napisz testy weryfikujące, czy w przypadku błędnie wykonanych ruchów zostanie rzucony odpowiedni wyjątek.
*/
}