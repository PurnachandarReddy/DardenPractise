package com.example.Course.service;

import com.example.Course.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    // Create operation
    Course createCourse(Course course);

    // Read operation
    List<Course> getAllCourses();

    Optional<Course> getCourseById(Long id);

    // Update operation
    Course updateCourse(Long id, Course updatedCourse);

    // Delete operation
    void deleteCourse(Long id);
}
