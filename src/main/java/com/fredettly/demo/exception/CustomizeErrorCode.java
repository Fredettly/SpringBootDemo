package com.fredettly.demo.exception;

/**
 * Created by xwx_ on 2020/2/2
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "问题不见了，换个试试~"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题和评论"),
    NO_LOGIN(2003, "未登录，请登陆后重试"),;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
