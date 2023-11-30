package com.example.Mentor.controller;

import com.example.Mentor.entity.APIResponse;
import com.example.Mentor.entity.Mentor;
import com.example.Mentor.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mentors")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    // Create operation
    @PostMapping
    public ResponseEntity<Mentor> createMentor(@RequestBody Mentor mentor) {
        Mentor createdMentor = mentorService.createMentor(mentor);
        return new ResponseEntity<>(createdMentor, HttpStatus.CREATED);
    }

    // Read operation
    @GetMapping
    public ResponseEntity<List<Mentor>> getAllMentors() {
        List<Mentor> mentors = mentorService.getAllMentors();
        return new ResponseEntity<>(mentors, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse> getMentorById(@PathVariable Long id) {
        Optional<APIResponse> apiResponse = mentorService.getMentorById(id);
        return apiResponse.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<Mentor> updateMentor(@PathVariable Long id, @RequestBody Mentor updatedMentor) {
        Mentor mentor = mentorService.updateMentor(id, updatedMentor);
        if (mentor != null) {
            return new ResponseEntity<>(mentor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMentor(@PathVariable Long id) {
        mentorService.deleteMentor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
