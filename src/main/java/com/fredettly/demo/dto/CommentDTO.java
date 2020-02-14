package com.fredettly.demo.dto;

import com.fredettly.demo.model.User;
import lombok.Data;

/**
 * Created by xwx_ on 2020/2/14
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private String content;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private User user;
}
