package com.qf.service.impl;

import com.qf.dao.VideoMapper;
import com.qf.pojo.Course;
import com.qf.pojo.Video;
import com.qf.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 19:59
 * @Description
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public Video findById(Integer videoId) {
        return videoMapper.findById(videoId);
    }

    public List<Course> findAll(Integer subjectId) {
        return videoMapper.findAll(subjectId);
    }

    public void updateVideo(Video video) {
        videoMapper.updateByPrimaryKey(video);
    }
}
