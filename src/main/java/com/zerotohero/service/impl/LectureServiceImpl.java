package com.zerotohero.service.impl;


import com.zerotohero.dto.LectureDTO;
import com.zerotohero.entity.Lecture;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.LectureRepository;
import com.zerotohero.service.SubjectService;

import java.util.List;
import java.util.stream.Collectors;

public class LectureServiceImpl implements SubjectService {
    private final LectureRepository lectureRepository;
    private final MapperUtil mapperUtil;

    public LectureServiceImpl(LectureRepository lectureRepository, MapperUtil mapperUtil) {
        this.lectureRepository = lectureRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public LectureDTO getByTitle(String title) {
        Lecture lecture = lectureRepository.findByTitle(title);
        return mapperUtil.convert(lecture, new com.zerotohero.dto.LectureDTO());
    }

    @Override
    public List<LectureDTO> listAllPrograms() {
        List<LectureDTO> lectureDTOList = lectureRepository.findAll().stream()
                .map(subject->mapperUtil.convert(subject,new LectureDTO()))
                .collect(Collectors.toList());
        return lectureDTOList;
    }

    @Override
    public void save(LectureDTO dto) {
        lectureRepository.save(mapperUtil.convert(dto,new Lecture()));
    }

    @Override
    public void update(LectureDTO dto) {
        Lecture lecture = lectureRepository.findByTitle(dto.getTitle());
        Lecture convertedLecture = mapperUtil.convert(dto, new Lecture());
        convertedLecture.setId(lecture.getId());
        lectureRepository.save(convertedLecture);
    }

    @Override
    public void delete(String title) {
        Lecture lecture = lectureRepository.findByTitle(title);
        lecture.setIsDeleted(true);
        lectureRepository.save(lecture);

    }

    @Override
    public void complete(String title) {

    }
}
