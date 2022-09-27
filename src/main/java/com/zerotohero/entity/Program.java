package com.zerotohero.entity;

import com.zerotohero.enums.ProjectStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private ProjectStatus programStatus;

    @OneToMany
    Set<User> user;

}
