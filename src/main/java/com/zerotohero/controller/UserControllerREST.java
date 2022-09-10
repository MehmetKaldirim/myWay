package com.zerotohero.controller;

import com.zerotohero.dto.UserDTO;
import com.zerotohero.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/api/v1")
public class UserControllerREST {

    private final UserService userService;

    public UserControllerREST(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserDTO> getAllCourses(){
        return userService.listAllUsers();
    }
}
