package com.zerotohero.dto;

import com.zerotohero.enums.ProgramStatus;
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
    private ProgramStatus programStatus;

    private List<UserDTO> userList;


}
