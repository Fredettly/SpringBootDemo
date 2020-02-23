package com.fredettly.demo.controller;

import com.fredettly.demo.dto.NotificationDTO;
import com.fredettly.demo.dto.QuestionDTO;
import com.fredettly.demo.model.User;
import com.fredettly.demo.service.NotificationService;
import com.fredettly.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xwx_ on 2020/1/17
 */
@Controller
public class ProfileController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name = "action") String action,
                          HttpServletRequest request,
                          Model model) {
        User user = (User) request.getSession().getAttribute("user");

        if (user == null) {
            return "redirect:/";
        }
        if ("questions".equals(action)) {
            model.addAttribute("section", "questions");
            model.addAttribute("sectionName", "我的提问");
            List<QuestionDTO> questionDTOList = questionService.listById(user.getId());
            model.addAttribute("questions", questionDTOList);
        } else if ("replies".equals(action)) {
            List<NotificationDTO> notificationDTOList = notificationService.list(user.getId());
            model.addAttribute("section", "replies");
            model.addAttribute("notification", notificationDTOList);
            model.addAttribute("sectionName", "最新回复");
        }
        return "profile";
    }
}
