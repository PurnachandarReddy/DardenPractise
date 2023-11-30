package com.example.Course.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int trainingHours;

//    @ManyToOne
//    @JoinColumn(name = "mentor_id")
//    private Mentor mentor;

    // Constructors, getters, setters
}
