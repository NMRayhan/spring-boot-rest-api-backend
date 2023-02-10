package springboot.nexus.crud.controller;

import org.springframework.web.bind.annotation.*;
import springboot.nexus.crud.model.Teacher;
import springboot.nexus.crud.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping(value = "/teachers")
@CrossOrigin
public class TeacherController {

    private TeacherService teacherService;

    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher){
        teacherService.saveTeacher(teacher);
        return "Save Teacher";
    }

    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

}
