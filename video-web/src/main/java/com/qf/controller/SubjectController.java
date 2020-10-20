package com.qf.controller;

import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:16
 * @Description
 */
@Controller
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("selectAll")
    public String findAllSubject(Model model) {
        List<Subject> subjectList = subjectService.findAllSubject();

        model.addAttribute("subjectList", subjectList);
        return "/WEB-INF/jsp/before/index.jsp";
    }


}
