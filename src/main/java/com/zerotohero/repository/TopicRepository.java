package com.zerotohero.repository;


import com.zerotohero.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {

   Topic findByTitle(String title);
}
