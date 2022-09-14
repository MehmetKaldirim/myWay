package com.zerotohero.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProgramDTO {

    private Long id;
    private String programCode;
    private List<SubjectDTO> subject;
    private Long studyProgress;
    private Long duration;
    private String programName;

    private List<UserDTO> userList;


}
