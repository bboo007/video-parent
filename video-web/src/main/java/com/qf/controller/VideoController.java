package com.qf.controller;

import com.qf.pojo.Course;
import com.qf.pojo.Subject;
import com.qf.pojo.Video;
import com.qf.service.CourseService;
import com.qf.service.SubjectService;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 19:33
 * @Description
 */
@RequestMapping("video")
@Controller
public class VideoController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private CourseService courseService;

    @RequestMapping("showVideo")
    public String showVideo(Integer videoId, String subjectName, Model model) {

        List<Subject> subject = subjectService.findBySubjectByName(subjectName);
        Integer subjectId = subject.get(0).getId();
        List<Course> course = courseService.findAll(subjectId);
        System.out.println(course.toString());

        Video video = videoService.findById(videoId);
        System.out.println(video.toString());

        Integer courseId = video.getCourseId();
        List<Subject> subjectList = subjectService.findAllSubject();

        model.addAttribute("subjectList", subjectList);
        model.addAttribute("subjectName", subjectName);
        model.addAttribute("video", video);
        model.addAttribute("course", course.get(0));

        return "/WEB-INF/jsp/before/section.jsp";
    }

    @RequestMapping("updatePlayNum")
    public void updatePlayNum(Integer id, Integer playNum) {
        Video video = videoService.findById(id);
        video.setPlayNum(playNum + 1);

        videoService.updateVideo(video);

    }
}
