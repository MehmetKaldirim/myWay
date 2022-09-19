package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.entity.User;
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

    private SubjectDTO subject;
    private User user;
}
