package com.zerotohero.dto;

import com.zerotohero.entity.Program;
import com.zerotohero.entity.User;
import com.zerotohero.enums.SubjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {

    private String title; // title of the subject
    private Long lectureDuration; // hours of the subject
    private Long lectureStudyProgress; // how much time has student completed from this subject
    private SubjectStatus subjectStatus;
    private Program program;
    private User user;
    private List<TopicDTO> topic;
}

