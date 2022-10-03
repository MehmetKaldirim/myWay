package com.zerotohero.service.impl;

import com.zerotohero.dto.SubjectDTO;
import com.zerotohero.entity.Subject;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.SubjectRepository;
import com.zerotohero.service.SubjectService;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;
    private final MapperUtil mapperUtil;

    public SubjectServiceImpl(SubjectRepository subjectRepository, MapperUtil mapperUtil) {
        this.subjectRepository = subjectRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public SubjectDTO getByTitle(String title) {
        Subject subject =subjectRepository.findByTitle(title);
        return mapperUtil.convert(subject, new SubjectDTO());
    }

    @Override
    public List<SubjectDTO> listAllPrograms() {
        List<SubjectDTO> subjectDTOList = subjectRepository.findAll().stream()
                .map(subject->mapperUtil.convert(subject,new SubjectDTO()))
                .collect(Collectors.toList());
        return subjectDTOList;
    }

    @Override
    public void save(SubjectDTO dto) {
        subjectRepository.save(mapperUtil.convert(dto,new Subject()));
    }

    @Override
    public void update(SubjectDTO dto) {
        Subject subject = subjectRepository.findByTitle(dto.getTitle());
        Subject convertedSubject = mapperUtil.convert(dto, new Subject());
        convertedSubject.setId(subject.getId());
        subjectRepository.save(convertedSubject);
    }

    @Override
    public void delete(String title) {
        Subject subject = subjectRepository.findByTitle(title);
        subject.setIsDeleted(true);
        subjectRepository.save(subject);

    }

    @Override
    public void complete(String title) {

    }
}
