package com.fredettly.demo.controller;


import com.fredettly.demo.dto.QuestionDTO;
import com.fredettly.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class IndexController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "search" , required = false) String search) {
        List<QuestionDTO> questionList = questionService.list(search);
        model.addAttribute("questions" , questionList);
        return "index";
    }

}
