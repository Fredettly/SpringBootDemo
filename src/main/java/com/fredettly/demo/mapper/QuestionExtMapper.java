package com.fredettly.demo.mapper;

import com.fredettly.demo.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incComment(Question record);
}