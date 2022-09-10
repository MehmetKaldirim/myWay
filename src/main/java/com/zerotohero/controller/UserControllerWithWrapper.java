package com.zerotohero.controller;


import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/api/v3")
public class UserControllerWithWrapper {

    private final UserService userService;

    public UserControllerWithWrapper(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllUsers(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Math.V3")
                .body(new ResponseWrapper("successfully retrieved",userService.listAllUsers()));
    }
}
