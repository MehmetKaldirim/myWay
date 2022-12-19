package com.zerotohero.controller;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.dto.UserDTO;
import com.zerotohero.entity.Program;
import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.ProgramService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{programCode}")
    public ResponseEntity<ResponseWrapper> getProgramByProgramCode(@PathVariable("programCode") String programCode) {
        ProgramDTO program = programService.getByProjectCode(programCode);
        return ResponseEntity.ok(new ResponseWrapper("Program is successfully retrieved", program, HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createProgram(@RequestBody ProgramDTO program) {
        programService.save(program);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("Program is successfully created", HttpStatus.CREATED));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateProgram(@RequestBody ProgramDTO program) {
        programService.update(program);
        return ResponseEntity.ok(new ResponseWrapper("Program is successfully updated", program, HttpStatus.OK));
    }

    @DeleteMapping("/{programCode}")
    public ResponseEntity<ResponseWrapper> deleteProgram(@PathVariable("programCode") String program) {
        programService.delete(program);
        return ResponseEntity.ok(new ResponseWrapper("Program is successfully deleted", HttpStatus.OK));

    }


}
