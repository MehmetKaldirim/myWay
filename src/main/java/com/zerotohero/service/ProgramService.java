package com.zerotohero.service;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.entity.Program;
import com.zerotohero.entity.User;

import java.util.List;

public interface ProgramService {

    ProgramDTO getByProjectCode(String code);

    ProgramDTO getById(Long Id);

    List<ProgramDTO> listAllPrograms();

    List<ProgramDTO> listAllProgramsLoggedInUser(String email);
    void save(ProgramDTO dto);
    void update(ProgramDTO dto);
    void delete(Long id);
    void complete(String projectCode);

 //   Program programDetails(String userEmail);


}
