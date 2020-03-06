package com.fredettly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xwx_ on 2020/3/6
 */
@Controller
public class VideoController {
    @GetMapping("/video")
    public String index() {
        return "video";
    }

    @GetMapping("/videos")
    public String videos(@RequestParam(name = "aid") String aid,
                         @RequestParam(name = "page", defaultValue = "1") String page,
                         Model model) {
        model.addAttribute("aid", aid);
        model.addAttribute("page", page);
        return "videos";
    }
}
