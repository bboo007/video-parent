package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("one")
    public String One(){
        return "/WEB-INF/jsp/behind/videoList.jsp";
    }
}
