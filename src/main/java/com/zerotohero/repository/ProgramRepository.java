package com.zerotohero.repository;

import com.zerotohero.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    Program findByProgramCode(String code);

    List<Program> findProgramByUsersEmail(String email);



}
