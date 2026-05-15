package pt.uc00605_2.escola.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pt.uc00605_2.escola.exeption.ResourceNotFoundException;
import pt.uc00605_2.escola.model.Course;
import pt.uc00605_2.escola.repository.CourseRepository;

@Service
public class CourseService {
        

    private final CourseRepository repository;

    public CourseService (CourseRepository repository){
        
        this.repository = repository;
    }

    /*** FIND ALL  é 1 dos métodos GET */
    public List<Course> findAll(){
        return repository.findAll();
    };

    /**FIND ById é 1 dos métodos GET */

    public Course findById(Long id){
        Course course = repository.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("Course Not Found With ID PAULA:" +id));

        return course;
    }
}
