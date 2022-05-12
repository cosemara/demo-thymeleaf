package com.example.thymeleaf.sample.exception;

import java.util.HashMap;
import java.util.Map;

public class CustomAccessDeniedException extends RuntimeException {
    private Map sendData = new HashMap();

    public CustomAccessDeniedException(String msg, Throwable t) {
        super(msg, t);
    }

    public CustomAccessDeniedException(String msg) {
        super(msg);
    }

    public CustomAccessDeniedException(String msg, Map sendData) {
        super(msg);
        if (sendData != null) {
            this.sendData = sendData;
        }
    }

    public CustomAccessDeniedException() {
        super();
    }

    public Map getSendData() {
        return sendData;
    }
}