package repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Employee, Long>{

}

