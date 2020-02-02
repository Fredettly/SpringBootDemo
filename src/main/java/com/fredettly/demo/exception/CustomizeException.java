package com.fredettly.demo.exception;

/**
 * Created by xwx_ on 2020/2/2
 */
public class CustomizeException extends RuntimeException {
        private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }
    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
