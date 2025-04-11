package tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.controller.model.Student;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student(1, "Himani", "Raj");
    }
}
