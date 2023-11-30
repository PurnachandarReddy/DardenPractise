package com.example.Mentor.service.impl;

import com.example.Mentor.entity.APIResponse;
import com.example.Mentor.entity.Course;
import com.example.Mentor.entity.Mentor;
import com.example.Mentor.repository.MentorRepository;
import com.example.Mentor.service.MentorService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MentorServiceImpl implements MentorService {

    @Autowired
    private MentorRepository mentorRepository;

    private RestTemplate restTemplate;

    public Mentor createMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }


    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }


    public Optional<APIResponse> getMentorById(Long id) {

        Mentor mentor=mentorRepository.findById(id).get();
        ResponseEntity<Course> responseEntity= restTemplate.getForEntity("http://localhost:8081/courses/"+ mentor.getCourseId(),
               Course.class);
        Course course=responseEntity.getBody();



        APIResponse apiResponse=new APIResponse();
        apiResponse.setMentor(mentor);
        apiResponse.setCourse(course);
        return Optional.of(apiResponse);
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
