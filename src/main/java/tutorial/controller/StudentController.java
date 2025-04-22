package tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student(1, "Himani", "Raj");
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ramesh","Fadtare"));
        students.add(new Student(2,"Umesh","Fadtare"));
        students.add(new Student(3,"Ram","Jadhav"));
        students.add(new Student(4,"Sanjay","Pawar"));
        return students;
    }
}
