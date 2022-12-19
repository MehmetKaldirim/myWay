package com.zerotohero.dto;

import com.zerotohero.entity.BaseEntity;
import com.zerotohero.enums.ProgramStatus;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProgramDTO extends BaseEntity {

    private Long id;
    private String programCode;
    private List<LectureDTO> subject;
    private Long studyProgress;
    private Long duration;
    private String programName;
    private ProgramStatus programStatus;

    private List<UserDTO> userList;

    @Override
    public String toString() {
        return "ProgramDTO{" +
                ", programCode='" + programCode + '\'' +
                ", subject=" + subject +
                ", studyProgress=" + studyProgress +
                ", duration=" + duration +
                ", programName='" + programName + '\'' +
                ", programStatus=" + programStatus +
                '}';
    }
}
