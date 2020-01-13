package com.fredettly.demo.model;

import lombok.Data;

/**
 * Created by xwx_ on 2020/1/13
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer Creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;


}
