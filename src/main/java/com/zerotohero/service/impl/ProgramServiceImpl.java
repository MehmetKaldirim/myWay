package com.zerotohero.service.impl;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.entity.Program;
import com.zerotohero.entity.User;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.ProgramRepository;
import com.zerotohero.service.ProgramService;
import com.zerotohero.service.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

public class ProgramServiceImpl implements ProgramService {

    private final MapperUtil mapperUtil;
    private final ProgramRepository programRepository;
    private final UserService userService;

    public ProgramServiceImpl(MapperUtil mapperUtil, ProgramRepository programRepository, UserService userService) {
        this.mapperUtil = mapperUtil;
        this.programRepository = programRepository;
        this.userService = userService;
    }

    @Override
    public ProgramDTO getByProjectCode(String code) {
        Program program = programRepository.findByProgramCode(code);
        return mapperUtil.convert(program, new ProgramDTO());
    }

    @Override
    public List<ProgramDTO> listAllProjects() {
        return null;
    }

    @Override
    public void save(ProgramDTO dto) {

    }

    @Override
    public void update(ProgramDTO dto) {

    }

    @Override
    public void delete(String code) {

    }

    @Override
    public void complete(String projectCode) {

    }

    @Override
    public List<ProgramDTO> listAllProjectDetails() {
        return null;
    }

    @Override
    public List<ProgramDTO> readAllByAssignedManager(User assignedMentor) {
        return null;
    }
}
