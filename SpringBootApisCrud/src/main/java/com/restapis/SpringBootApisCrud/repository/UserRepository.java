package com.restapis.SpringBootApisCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapis.SpringBootApisCrud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
