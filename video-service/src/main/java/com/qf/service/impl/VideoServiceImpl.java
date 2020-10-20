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
import com.qf.pojo.Video;
import com.qf.pojo.VideoExample;
import com.qf.service.VideoService;
import com.qf.utils.VideoQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findById(Integer videoId) {
        return videoMapper.findById(videoId);
    }

    @Override
    public List<Course> findAll(Integer subjectId) {
        return videoMapper.findAll(subjectId);
    }

    @Override
    public void updateVideo(Video video) {
        videoMapper.updateByPrimaryKey(video);

    }

    @Override
    public List<Map> findByPage(VideoQueryVo videoQueryVo) {
        return videoMapper.findByPage(videoQueryVo);
    }

    @Override
    public Video findByID(Integer id) {
        return videoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addVideo(Video video) {
        return videoMapper.insert(video);
    }

    @Override
    public void updateVideoWithBlobs(Video video) {
        videoMapper.updateByPrimaryKeyWithBLOBs(video);
    }

    @Override
    public int deleteVideo(Integer id) {
        return videoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int delBatchVideos(Integer[] ids) {
        VideoExample videoExample = new VideoExample();
        VideoExample.Criteria criteria = videoExample.createCriteria();
        criteria.andIdIn(Arrays.asList(ids));
        return videoMapper.deleteByExample(videoExample);
    }
}
