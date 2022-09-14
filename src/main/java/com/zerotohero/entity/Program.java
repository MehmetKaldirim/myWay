package com.zerotohero.entity;

import com.zerotohero.enums.ProgramStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="programs")
public class Program extends BaseEntity{

    private String programCode;
    @OneToMany(mappedBy = "program")
    private List<Subject> subject;
    private Long studyProgress;
    private Long duration;
    private String programName;

    @Enumerated(EnumType.STRING)
    private ProgramStatus programStatus;


    @OneToMany
    private List<User> userList;


}
