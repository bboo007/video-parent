package com.qf.controller;

import com.qf.pojo.Course;
import com.qf.pojo.Subject;
import com.qf.service.CourseService;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:34
 * @Description
 */
@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/course/{id}")
    public String findBySubjectId(@PathVariable(name = "id") Integer id, Model model) {

        List<Subject> subjectList = subjectService.findAllSubject();
        model.addAttribute("subjectList", subjectList);

        Subject subject = subjectService.findCourseBySubjectId(id);
        model.addAttribute("subject", subject);


        return "/WEB-INF/jsp/before/course.jsp";
    }
}
