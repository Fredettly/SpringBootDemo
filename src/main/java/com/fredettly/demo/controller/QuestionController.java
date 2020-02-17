package com.fredettly.demo.controller;

import com.fredettly.demo.dto.CommentDTO;
import com.fredettly.demo.dto.QuestionDTO;
import com.fredettly.demo.enums.CommentTypeEnum;
import com.fredettly.demo.mapper.QuestionMapper;
import com.fredettly.demo.service.CommentService;
import com.fredettly.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by xwx_ on 2020/1/22
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model) {
        QuestionDTO questionDTO = questionService.getById(id);

        List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);

        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id
    ) {
        questionMapper.deleteByPrimaryKey(id);
        return "redirect:/";
    }
}
