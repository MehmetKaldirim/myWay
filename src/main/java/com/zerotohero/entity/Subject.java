package com.zerotohero.entity;

import com.zerotohero.enums.SubjectStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="subjects")
public class Subject extends BaseEntity{

    private String title; // title of the subject
    private Long subjectDuration; // hours of the subject
    private Long subjectStudyProgress; // how much time has student completed from this subject
    @ManyToOne
    private Program program;
    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private SubjectStatus subjectStatus;
}

