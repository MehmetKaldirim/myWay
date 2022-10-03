package com.zerotohero.service.impl;

import com.zerotohero.dto.LectureDTO;
import com.zerotohero.dto.TopicDTO;
import com.zerotohero.entity.Topic;
import com.zerotohero.enums.TopicStatus;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.TopicRepository;
import com.zerotohero.service.TopicService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TopicServiceImpl implements TopicService {


    private final TopicRepository topicRepository;
    private final MapperUtil mapperUtil;

    public TopicServiceImpl(TopicRepository topicRepository, MapperUtil mapperUtil) {
        this.topicRepository = topicRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public TopicDTO findById(Long id) {
        Optional<Topic> task = topicRepository.findById(id);


        if(task.isPresent()){
            return mapperUtil.convert(task.get(),new TopicDTO());
        }
        return null ;
    }

    @Override
    public List<TopicDTO> listAllTasks() {
        List<TopicDTO> listTopics = topicRepository.findAll().stream().map(topic->mapperUtil.convert(topic,new TopicDTO())).collect(Collectors.toList());
        return listTopics;
    }

    @Override
    public void save(TopicDTO dto) {
        dto.setTopicStatus(TopicStatus.OPEN);

        Topic topic = mapperUtil.convert(dto,new Topic());
        topicRepository.save(topic);

    }

    @Override
    public void update(TopicDTO dto) {
        Topic topic = topicRepository.findByTitle(dto.getTitle());
        Topic convertedTopic = mapperUtil.convert(dto, new Topic());
        convertedTopic.setId(topic.getId());
        topicRepository.save(convertedTopic);

    }

    @Override
    public void delete(Long id) {
        Topic topic = topicRepository.findById(id).get();
        topic.setIsDeleted(true);
        topicRepository.save(topic);

    }

    @Override
    public int totalNonCompletedTask(String projectCode) {
        return 0;
    }

    @Override
    public int totalCompletedTask(String projectCode) {
        return 0;
    }

    @Override
    public void deleteBySubject(LectureDTO project) {

    }

    @Override
    public void completeBySubject(LectureDTO project) {

    }

    @Override
    public List<TopicDTO> listAllTopicsByStatusIsNot(TopicStatus status) {
        return null;
    }

    @Override
    public void updateStatus(TopicDTO task) {

    }
}
