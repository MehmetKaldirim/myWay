package com.zerotohero.controller;


import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/api/v2")
public class UserControllerWithWrapper {

    private final UserService userService;

    public UserControllerWithWrapper(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllUsers() {

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Math.V3")
                .body(new ResponseWrapper("successfully retrieved", userService.listAllUsers()));
    }

    @GetMapping("/{email}")
    public ResponseEntity<ResponseWrapper> getUserByUserName(@PathVariable("email") String email) {
        UserDTO user = userService.findByEmail(email);
        return ResponseEntity.ok(new ResponseWrapper("User is successfully retrieved", user, HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createUser(@RequestBody UserDTO user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("User is successfully created", HttpStatus.CREATED));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateUser(@RequestBody UserDTO user) {
        userService.update(user);
        return ResponseEntity.ok(new ResponseWrapper("User is successfully updated", user, HttpStatus.OK));
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<ResponseWrapper> deleteUser(@PathVariable("email") String email) {
        userService.delete(email);
        return ResponseEntity.ok(new ResponseWrapper("User is successfully deleted", HttpStatus.OK));

    }
}