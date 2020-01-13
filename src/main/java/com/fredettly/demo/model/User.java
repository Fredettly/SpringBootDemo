package com.fredettly.demo.model;

import lombok.Data;

/**
 * Created by xwx_ on 2020/1/9
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
