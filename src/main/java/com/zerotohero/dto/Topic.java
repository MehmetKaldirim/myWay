package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic extends BaseEntity {

    private String title; // title of the subject
    private Long topicDuration; // hours of the subject
    private Long topicStudyProgress;
    @ManyToOne
    private Subject subject;

}
