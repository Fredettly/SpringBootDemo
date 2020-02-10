package com.fredettly.demo.exception;

/**
 * Created by xwx_ on 2020/2/2
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "问题不见了，换个试试~"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何问题和评论"),
    NO_LOGIN(2003, "未登录，请登陆后重试"),
    SYS_ERROR(2004, "服务器发烧了，隔离片刻再来~"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2005, "回复的评论不存在了，换一个试试"),
    ;

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
