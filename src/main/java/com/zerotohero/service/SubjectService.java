package com.zerotohero.service;

import com.zerotohero.dto.LectureDTO;
import com.zerotohero.dto.ProgramDTO;

import java.util.List;

public interface SubjectService {
    LectureDTO getByTitle(String title);
    List<LectureDTO> listAllPrograms();
    void save(LectureDTO dto);
    void update(LectureDTO dto);
    void delete(String title);
    void complete(String title);

}
