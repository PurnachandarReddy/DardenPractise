package com.example.Course.service.impl;

import com.example.Course.entity.Course;
import com.example.Course.repository.CourseRepository;
import com.example.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;


    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }


    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }


    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }


    public Course updateCourse(Long id, Course updatedCourse) {
        if (courseRepository.existsById(id)) {
            updatedCourse.setId(id);
            return courseRepository.save(updatedCourse);
        } else {
            // Handle the case where the course with the given ID doesn't exist
            return null;
        }
    }


    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
