package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
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
    @ManyToOne
    private SubjectDTO subject;

}
