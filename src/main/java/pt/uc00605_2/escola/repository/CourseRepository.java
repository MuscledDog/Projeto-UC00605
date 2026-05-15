package pt.uc00605_2.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pt.uc00605_2.escola.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
