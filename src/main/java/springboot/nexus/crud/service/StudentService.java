package springboot.nexus.crud.service;

import springboot.nexus.crud.model.Student;


import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
