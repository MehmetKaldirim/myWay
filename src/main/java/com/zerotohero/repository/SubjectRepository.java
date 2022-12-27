package com.zerotohero.repository;

import com.zerotohero.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
    Subject findByTitle(String title);

    List<Subject> findSubjectByProgramProgramCode(String programCode);
}
