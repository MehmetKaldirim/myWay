package com.zerotohero.dto;

import com.zerotohero.enums.ProjectStatus;
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
    private ProjectStatus programStatus;

    private List<UserDTO> userList;


}
