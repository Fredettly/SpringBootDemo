package com.fredettly.demo.dto;

import com.fredettly.demo.model.User;
import lombok.Data;

/**
 * Created by xwx_ on 2020/2/21
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private String type;
}
