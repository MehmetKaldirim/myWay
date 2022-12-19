package com.zerotohero.service;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.entity.Program;
import com.zerotohero.entity.User;

import java.util.List;

public interface ProgramService {

    ProgramDTO getByProjectCode(String code);

    List<ProgramDTO> listAllPrograms();
    void save(ProgramDTO dto);
    void update(ProgramDTO dto);
    void delete(String code);
    void complete(String projectCode);

 //   Program programDetails(String userEmail);


}
