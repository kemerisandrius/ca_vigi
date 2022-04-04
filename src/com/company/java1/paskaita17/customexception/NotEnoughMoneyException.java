package com.company.java1.paskaita17.customexception;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(String message) {
        super(message);
    }

    public NotEnoughMoneyException(String message, Throwable t) {
        super(message, t);
    }

}
