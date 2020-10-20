package com.qf.service;

import com.qf.pojo.Course;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:36
 * @Description
 */
public interface CourseService {
    List<Course> findBySubjectId(Integer id);

    Course findById(Integer courseId);

    List<Course> findAll(Integer subjectId);
}
