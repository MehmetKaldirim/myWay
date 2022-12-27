package com.zerotohero.controller;

import com.zerotohero.dto.ProgramDTO;
import com.zerotohero.dto.SubjectDTO;
import com.zerotohero.entity.ResponseWrapper;
import com.zerotohero.service.ProgramService;
import com.zerotohero.service.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/subjects/api/v3")
public class SubjectControllerWithWrapper {
    private final SubjectService subjectService;

    public SubjectControllerWithWrapper(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllSubjectss(){
        List<SubjectDTO> subjectDTOList = subjectService.listAllSubjects();
        subjectService.listAllSubjects().forEach(System.out::println);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Math.V3")
                .body(new ResponseWrapper("All subjects are successfully retrieved",subjectService.listAllSubjects()));
    }

    @GetMapping("/{title}")
    public ResponseEntity<ResponseWrapper> getSubjectByTitle(@PathVariable("title") String title) {
        SubjectDTO subject = subjectService.getByTitle(title);
        return ResponseEntity.ok(new ResponseWrapper("Subject is successfully retrieved", subject, HttpStatus.OK));
    }

    @PostMapping
    public ResponseEntity<ResponseWrapper> createSubject(@RequestBody SubjectDTO subject) {
        subjectService.save(subject);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseWrapper("Subject is successfully created", HttpStatus.CREATED));
    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateSubject(@RequestBody SubjectDTO subject) {
        subjectService.update(subject);
        return ResponseEntity.ok(new ResponseWrapper("Subject is successfully updated", subject, HttpStatus.OK));
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<ResponseWrapper> deleteProgram(@PathVariable("title") String title) {
        subjectService.delete(title);
        return ResponseEntity.ok(new ResponseWrapper("Subject is successfully deleted", HttpStatus.OK));

    }


}
