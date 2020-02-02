package com.fredettly.demo.exception;

/**
 * Created by xwx_ on 2020/2/2
 */
public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("问题不见了，换个试试~");

    @Override
    public String getMessage() {
        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
