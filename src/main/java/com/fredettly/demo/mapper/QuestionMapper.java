package com.fredettly.demo.mapper;

import com.fredettly.demo.dto.QuestionDTO;
import com.fredettly.demo.model.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by xwx_ on 2020/1/13
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,tag)values(#{title},#{description},#{gmtCreate},#{gmtModified},#{Creator},#{tag})")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();

    @Select("select * from question where creator = ${userId}")
    List<Question> listById(@Param("userId") Integer userId);

    @Select("select * from question where id = #{id}")
    Question getById(@Param("id") Integer id);

    @Update("update question set title = #{title}, description = #{description}, gmt_modified = #{gmtModified}, tag = #{tag} where id = #{id}")
    void update(Question question);

    @Delete("delete from question where id = #{id}")
    void delete(Integer id);
}
