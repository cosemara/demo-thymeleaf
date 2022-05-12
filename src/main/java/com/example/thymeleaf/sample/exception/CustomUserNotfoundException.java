package com.example.thymeleaf.sample.exception;

import java.util.HashMap;
import java.util.Map;

public class CustomUserNotfoundException extends RuntimeException {
    private Map sendData = new HashMap();

    public CustomUserNotfoundException(String msg, Throwable t) {
        super(msg, t);
    }

    public CustomUserNotfoundException(String msg) {
        super(msg);
    }

    public CustomUserNotfoundException(String msg, Map sendData) {
        super(msg);
        if (sendData != null) {
            this.sendData = sendData;
        }
    }

    public CustomUserNotfoundException() {
        super();
    }

    public Map getSendData() {
        return sendData;
    }
}