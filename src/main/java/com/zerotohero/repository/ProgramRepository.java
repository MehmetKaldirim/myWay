package com.zerotohero.repository;

import com.zerotohero.entity.Program;

public interface ProgramRepository {
    Program findByProgramCode(String code);

}
