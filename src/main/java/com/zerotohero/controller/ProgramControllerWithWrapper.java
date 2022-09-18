package com.zerotohero.controller;

import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.ProgramService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programs/api/v3")
public class ProgramControllerWithWrapper {

    private final ProgramService programService;

    public ProgramControllerWithWrapper(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllPrograms(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Math.V3")
                .body(new ResponseWrapper("successfully retrieved",programService.listAllPrograms()));
    }
}
