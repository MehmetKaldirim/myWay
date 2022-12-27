package com.zerotohero.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zerotohero.dto.SubjectDTO;
import com.zerotohero.enums.ProgramStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="programs")
public class Program extends BaseEntity{

    private String programCode;
    private Long studyProgress;
    private Long duration;
    private String programName;

    @Enumerated(EnumType.STRING)
    private ProgramStatus programStatus;

    @OneToMany
    private Set<Subject> subjectList;

    @ManyToMany(mappedBy = "programList")
    @JsonIgnore
    private List<User> userList;

}
