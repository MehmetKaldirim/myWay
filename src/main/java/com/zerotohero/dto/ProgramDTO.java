package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.enums.ProgramStatus;
import lombok.*;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProgramDTO extends BaseEntity {

    private Long id;
    private String programCode;
    private List<SubjectDTO> lecture;
    private Long studyProgress;
    private Long duration;
    private String programName;
    private ProgramStatus programStatus;

    private Set<UserDTO> userList;

    private Set<SubjectDTO> subjeytList;
    @Override
    public String toString() {
        return "ProgramDTO{" +
                ", programCode='" + programCode + '\'' +
                ", lecture=" + lecture +
                ", studyProgress=" + studyProgress +
                ", duration=" + duration +
                ", programName='" + programName + '\'' +
                ", programStatus=" + programStatus +
                '}';
    }
}
