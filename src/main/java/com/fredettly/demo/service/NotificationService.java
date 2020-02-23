package com.fredettly.demo.service;

import com.fredettly.demo.dto.NotificationDTO;
import com.fredettly.demo.enums.NotificationTypeEnum;
import com.fredettly.demo.mapper.NotificationMapper;
import com.fredettly.demo.mapper.UserMapper;
import com.fredettly.demo.model.Notification;
import com.fredettly.demo.model.NotificationExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xwx_ on 2020/2/21
 */
@Service
public class NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;

    @Autowired
    private UserMapper userMapper;

    public List<NotificationDTO> list(Long userId) {
        NotificationExample example = new NotificationExample();
        example.createCriteria()
                .andReceiverEqualTo(userId);
        example.setOrderByClause("gmt_create desc");
        List<Notification> notifications = notificationMapper.selectByExample(example);

        List<NotificationDTO> notificationDTOS = new ArrayList<>();

        for (Notification notification : notifications) {
            NotificationDTO notificationDTO = new NotificationDTO();
            BeanUtils.copyProperties(notification, notificationDTO);
            notificationDTO.setType(NotificationTypeEnum.nameOfType(notification.getType()));
            notificationDTOS.add(notificationDTO);
        }
        return notificationDTOS;
    }

    public Long unreadCount(Long userId) {
        NotificationExample notificationExample = new NotificationExample();
        notificationExample.createCriteria()
                .andReceiverEqualTo(userId);
        return notificationMapper.countByExample(notificationExample);
    }
}





