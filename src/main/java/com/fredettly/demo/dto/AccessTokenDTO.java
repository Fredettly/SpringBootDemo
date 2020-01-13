package com.fredettly.demo.dto;

import lombok.Data;

/**
 * Created by xwx_ on 2020/1/7
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
    private String avatar_uri;

}
