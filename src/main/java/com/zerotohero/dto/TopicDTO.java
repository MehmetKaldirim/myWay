package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.entity.User;
import com.zerotohero.enums.TopicStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {

    private String title; // title of the subject
    private Long topicDuration; // hours of the subject
    private Long topicStudyProgress;

    private LectureDTO subject;
    private User user;
    private TopicStatus topicStatus;

}
