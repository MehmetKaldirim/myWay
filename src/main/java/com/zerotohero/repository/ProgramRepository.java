package com.zerotohero.repository;

import com.zerotohero.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    Program findByProgramCode(String code);

    Program findByUser_UserEmail(String userEmail);

}
