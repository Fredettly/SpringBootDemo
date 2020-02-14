package com.fredettly.demo.dto;

import lombok.Data;

/**
 * Created by xwx_ on 2020/2/6
 */
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
