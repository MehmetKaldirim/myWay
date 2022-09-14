package com.zerotohero.service;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.entity.User;

import java.util.List;

public interface ProgramService {

    ProgramDTO getByProjectCode(String code);
    List<ProgramDTO> listAllProjects();
    void save(ProgramDTO dto);
    void update(ProgramDTO dto);
    void delete(String code);
    void complete(String projectCode);

    List<ProgramDTO> listAllProjectDetails();

    List<ProgramDTO> readAllByAssignedManager(User assignedMentor);
}
