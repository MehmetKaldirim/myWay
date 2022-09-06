package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.entity.Program;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends BaseEntity {

    private String title; // title of the subject
    private Long subjectDuration; // hours of the subject
    private Long subjectStudyProgress; // how much time has student completed from this subject
    private Program program;

    private List<Topic> topic;
}

