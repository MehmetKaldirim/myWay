package com.zerotohero.repository;

import com.zerotohero.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    void deleteByEmail(String email);

}
