package com.example.SpringBootGithubLink;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentClass, Integer>{

}