package com.zerotohero.repository;

import com.zerotohero.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
    Subject findByTitle(String title);

}
