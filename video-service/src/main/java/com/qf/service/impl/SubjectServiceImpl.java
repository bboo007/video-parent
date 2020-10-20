package com.qf.service.impl;

import com.qf.dao.SubjectMapper;
import com.qf.pojo.Subject;
import com.qf.pojo.SubjectExample;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 15:22
 * @Description
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<Subject> findAllSubject() {

        return subjectMapper.selectByExample(null);
    }

    @Override
    public Subject findCourseBySubjectId(Integer id) {
        return subjectMapper.findCourseBySubjectId(id);
    }

    @Override
    public List<Subject> findBySubjectByName(String subjectName) {
        SubjectExample subjectExample = new SubjectExample();
        SubjectExample.Criteria criteria = subjectExample.createCriteria();
        criteria.andSubjectNameEqualTo(subjectName);
        return subjectMapper.selectByExample(subjectExample);
    }
}
