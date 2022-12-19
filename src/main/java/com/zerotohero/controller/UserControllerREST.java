package com.zerotohero.controller;

import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.User;
import com.zerotohero.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users/api/v1")
public class UserControllerREST {

    private final UserService userService;

    public UserControllerREST(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<UserDTO> getAllUsers(){
        return userService.listAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody UserDTO user){
        return userService.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody UserDTO user){

        userService.update(user);
    }

    @DeleteMapping("/{email}")
    public void deleteUserByEmail(@PathVariable("email") String email){
        userService.delete(email);
    }


}
