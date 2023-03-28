package com.tictactoe.exception;

public class WinnerException extends Throwable{

    private String exceptionMessage;
    public WinnerException(String exceptionMessage) { this.exceptionMessage = exceptionMessage;}

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    }


