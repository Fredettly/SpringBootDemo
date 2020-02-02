package com.fredettly.demo.advice;

import com.fredettly.demo.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xwx_ on 2020/2/2
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle( Throwable e, Model model) {
        if (e instanceof CustomizeException) {
            model.addAttribute("message", e.getMessage());
        } else {

            model.addAttribute("message", "服务器发烧了，隔离片刻再来~");
        }
        return new ModelAndView("error");
    }

}
