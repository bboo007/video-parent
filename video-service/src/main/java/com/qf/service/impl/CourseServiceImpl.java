package com.qf.service.impl;

import com.qf.dao.CourseMapper;
import com.qf.pojo.Course;
import com.qf.pojo.CourseExample;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:36
 * @Description
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;



    public List<Course> findBySubjectId(Integer id) {

        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        criteria.andSubjectIdEqualTo(id);

        return courseMapper.selectByExample(courseExample);
    }

    public Course findById(Integer courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    public List<Course> findAll(Integer subjectId) {
        return courseMapper.findAll(subjectId);
    }
}
