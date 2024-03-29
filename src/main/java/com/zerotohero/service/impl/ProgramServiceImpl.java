package com.zerotohero.service.impl;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.Program;
import com.zerotohero.entity.User;
import com.zerotohero.enums.ProgramStatus;
import com.zerotohero.mapper.MapperUtil;
import com.zerotohero.repository.ProgramRepository;
import com.zerotohero.service.ProgramService;
import com.zerotohero.service.UserService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
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
    public ProgramDTO getById(Long id) {
        Program program = programRepository.findById(id).get();
        return mapperUtil.convert(program, new ProgramDTO());
    }
    @Override
    public List<ProgramDTO> listAllPrograms() {
        List<ProgramDTO> programDTOS = programRepository.findAll().stream()
                .map(program->mapperUtil.convert(program,new ProgramDTO()))
                .filter(a->a.getIsDeleted()== false)
                .collect(Collectors.toList());
        return programDTOS;
    }

    public List<ProgramDTO> listAllProgramsLoggedInUser(String email){
        List<ProgramDTO> programDTOS = programRepository.findProgramByUsersEmail(email).stream()
                .map(program->mapperUtil.convert(program,new ProgramDTO()))
                .collect(Collectors.toList());
        return programDTOS;
    }


    @Override
    public void save(ProgramDTO dto) {

        programRepository.save(mapperUtil.convert(dto,new Program()));
    }

    @Override
    public void update(ProgramDTO dto) {

        Program program = programRepository.findById(dto.getId()).get();
        System.out.println("here is program code and  id " + program.getProgramCode()+ program.getId());


        Program convertedProgram = mapperUtil.convert(dto, new Program());
        //set id to converted object which we found in DB by Email
        convertedProgram.setId(program.getId());
        programRepository.save(convertedProgram);
    }



    @Override
    public void delete(Long id) {
        Program program = programRepository.findById(id).get();
        program.setIsDeleted(true);
        programRepository.save(program);
    }

    @Override
    public void complete(String code) {
        Program program = programRepository.findByProgramCode(code);
        program.setProgramStatus(ProgramStatus.COMPLETE);
        programRepository.save(program);

    }

 /*   @Override
    public Program programDetails(String userEmail) {

        Program program = programRepository.findProgramByUser_email(userEmail);
        return program;

    }*/

}
