package springboot.nexus.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.nexus.crud.model.Student;
import springboot.nexus.crud.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return  "New Student Added";
    }

    @GetMapping("/getallstudent")
    public List<Student> getAllStudents(){
        return studentService.getAStudents();
    }

}
