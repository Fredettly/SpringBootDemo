package com.fredettly.demo.mapper;

import com.fredettly.demo.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xwx_ on 2020/1/13
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into Question(title,description,gmt_create,gmt_modified,creator,tag)values(#{title},#{description},#{gmtCreate},#{gmtModified},#{Creator},#{tag})")
    void create(Question question);
}
