package com.qf.service;

import com.qf.pojo.Course;
import com.qf.pojo.Video;

import java.util.List;

/**
 * @author DELL
 * @date 2020-10-19 19:59
 * @Description
 */
public interface VideoService {
    Video findById(Integer videoId);

    List<Course> findAll(Integer subjectId);

    void updateVideo(Video video);
}
