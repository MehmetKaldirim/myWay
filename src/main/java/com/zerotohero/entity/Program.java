package com.zerotohero.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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


    @OneToMany
    private List<User> userList;


}
