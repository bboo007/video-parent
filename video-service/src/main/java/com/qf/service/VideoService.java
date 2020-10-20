package com.qf.service;

import com.qf.pojo.Course;
import com.qf.pojo.Video;
import com.qf.utils.VideoQueryVo;

import java.util.List;
import java.util.Map;

/**
 * @author DELL
 * @date 2020-10-19 19:59
 * @Description
 */
public interface VideoService {
    Video findById(Integer videoId);

    List<Course> findAll(Integer subjectId);

    void updateVideo(Video video);


    List<Map> findByPage(VideoQueryVo videoQueryVo);

    Video findByID(Integer id);

    int addVideo(Video video);

    int deleteVideo(Integer id);

    int delBatchVideos(Integer[] ids);

    void updateVideoWithBlobs(Video video);
}
