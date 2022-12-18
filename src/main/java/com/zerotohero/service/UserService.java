package com.zerotohero.service;

import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.User;

import java.util.List;

public interface UserService {

    List<UserDTO> listAllUsers();

    User save(UserDTO dto);

    UserDTO update(UserDTO dto);

    void deleteByEmail(String email );

    void delete(String username);

    UserDTO findById(Long id);

    UserDTO findByEmail(String email);




}
