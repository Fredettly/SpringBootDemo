package com.fredettly.demo.enums;

public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer Type;

    public Integer getType() {
        return Type;
    }

    CommentTypeEnum(Integer type) {
        Type = type;
    }
}
