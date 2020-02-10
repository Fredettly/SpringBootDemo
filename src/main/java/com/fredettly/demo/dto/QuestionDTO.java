package com.fredettly.demo.dto;

import com.fredettly.demo.model.User;
import lombok.Data;

/**
 * Created by xwx_ on 2020/1/15
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long Creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
