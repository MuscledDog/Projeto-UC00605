package pt.uc00605_2.escola.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import pt.uc00605_2.escola.model.Course;
import pt.uc00605_2.escola.service.CourseService;


@RestController // 1. Ativa o controlador e o JSON
@RequestMapping("/api/courses")  //2. Define a rota base para todos os métodos
public class CourseController {
    
private final CourseService service;

private CourseController(CourseService service){
    this.service = service;
    }

    /** GET que busca os cursos */
    @GetMapping()
    public List<Course> buscaCourses (){
        return this.service.findAll();
}

/** GET by Id */

    @GetMapping("/{id}")
    public Course buscaCoursePorId(@PathVariable @NotNull @Positive Long id){
    return this.service.findById(id);
}

}
