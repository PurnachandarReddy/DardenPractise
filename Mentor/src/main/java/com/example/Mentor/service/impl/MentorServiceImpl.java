package com.example.Mentor.service.impl;

import com.example.Mentor.entity.Mentor;
import com.example.Mentor.repository.MentorRepository;
import com.example.Mentor.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {
    @Autowired
    private MentorRepository mentorRepository;


    public Mentor createMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }


    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }


    public Optional<Mentor> getMentorById(Long id) {
        return mentorRepository.findById(id);
    }


    public Mentor updateMentor(Long id, Mentor updatedMentor) {
        if (mentorRepository.existsById(id)) {
            updatedMentor.setId(id);
            return mentorRepository.save(updatedMentor);
        } else {
            // Handle the case where the mentor with the given ID doesn't exist
            return null;
        }
    }


    public void deleteMentor(Long id) {
        mentorRepository.deleteById(id);
    }

}
