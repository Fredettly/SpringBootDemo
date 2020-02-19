package com.fredettly.demo.mapper;

import com.fredettly.demo.model.Question;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);
    int incComment(Question record);
    List<Question> selectRelated(Question question);
}