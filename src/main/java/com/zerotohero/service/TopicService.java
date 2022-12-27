package com.zerotohero.service;

import com.zerotohero.dto.SubjectDTO;
import com.zerotohero.dto.TopicDTO;
import com.zerotohero.enums.TopicStatus;

import java.util.List;

public interface TopicService {
    TopicDTO findById(Long id);
    List<TopicDTO> listAllTasks();
    void save(TopicDTO dto);
    void update(TopicDTO dto);
    void delete(Long id);
    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

    void deleteBySubject(SubjectDTO project);

    void completeBySubject(SubjectDTO project);

    List<TopicDTO> listAllTopicsByStatusIsNot(TopicStatus status);

    void updateStatus(TopicDTO task);
}
