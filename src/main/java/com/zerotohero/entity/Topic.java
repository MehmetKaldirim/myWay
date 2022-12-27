package com.zerotohero.entity;

import com.zerotohero.enums.TopicStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="topics")
public class Topic extends BaseEntity{

    private String title; // title of the subject
    private Long topicDuration; // hours of the subject
    private Long topicStudyProgress;
    @ManyToOne
    private Subject subject;
    @Enumerated(EnumType.STRING)
    private TopicStatus topicStatus;

}
