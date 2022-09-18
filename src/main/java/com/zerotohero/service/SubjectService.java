package com.zerotohero.service;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {
    SubjectDTO getByTitle(String title);
    List<SubjectDTO> listAllPrograms();
    void save(SubjectDTO dto);
    void update(SubjectDTO dto);
    void delete(String title);
    void complete(String title);

}
