package com.zerotohero.repository;

import com.zerotohero.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture,Long> {
    Lecture findByTitle(String title);

}
