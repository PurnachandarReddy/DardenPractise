package com.example.Mentor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long id;

    private String courseName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int trainingHours;


}
