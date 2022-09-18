package com.zerotohero.controller;


import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/api/v2")
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

    @GetMapping("/{email}")
    public ResponseEntity<ResponseWrapper> getUserByUserName(@PathVariable("email") String email){
        UserDTO user = userService.findByEmail(email);
        return ResponseEntity.ok(new ResponseWrapper("User is successfully retrieved",user,HttpStatus.OK));
    }
}
