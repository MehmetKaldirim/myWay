package com.zerotohero.entity;

import com.zerotohero.enums.LectureStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="lectures")
public class Lecture extends BaseEntity{

    private String title; // title of the subject
    private Long lectureDuration; // hours of the subject
    private Long lectureStudyProgress; // how much time has student completed from this subject
    @ManyToOne
    private Program program;
    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private LectureStatus lectureStatus;
}

