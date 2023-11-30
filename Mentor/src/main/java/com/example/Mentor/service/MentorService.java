package com.example.Mentor.service;

import com.example.Mentor.entity.Mentor;

import java.util.List;
import java.util.Optional;

public interface MentorService {
    // Create operation
    Mentor createMentor(Mentor mentor);

    // Read operation
    List<Mentor> getAllMentors();

    Optional<Mentor> getMentorById(Long id);

    // Update operation
    Mentor updateMentor(Long id, Mentor updatedMentor);

    // Delete operation
    void deleteMentor(Long id);
}
