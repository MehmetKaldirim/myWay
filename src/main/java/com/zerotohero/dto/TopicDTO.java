package com.zerotohero.dto;

import com.zerotohero.enums.TopicStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {

    private String title; // title of the subject
    private Long topicDuration; // hours of the subject
    private Long topicStudyProgress;

    private SubjectDTO lecture;
    private TopicStatus topicStatus;

}
