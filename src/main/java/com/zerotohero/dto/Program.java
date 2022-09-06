package com.zerotohero.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor


public class Program {

    private Long id;
    private List<Subject> subject;
    private Long studyProgress;
    private Long duration;
    private String programName;

    private List<UserDTO> userList;


}
