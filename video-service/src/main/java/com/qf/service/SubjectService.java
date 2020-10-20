package com.qf.service;

import com.qf.pojo.Subject;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:20
 * @Description
 */
public interface SubjectService {
    List<Subject> findAllSubject();

    Subject findCourseBySubjectId(Integer id);

    List<Subject> findBySubjectByName(String subjectName);
}
