package com.fredettly.demo.service;

import com.fredettly.demo.exception.CustomizeErrorCode;
import com.fredettly.demo.exception.CustomizeException;
import com.fredettly.demo.model.Comment;
import org.springframework.stereotype.Service;

/**
 * Created by xwx_ on 2020/2/8
 */
@Service
public class CommentService {
    public void insert(Comment comment) {
        if (comment.getParentId() == null || comment.getParentId() == 0) {
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }
    }
}
