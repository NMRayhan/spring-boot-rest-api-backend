package springboot.nexus.crud.service;

import org.springframework.stereotype.Service;
import springboot.nexus.crud.model.Student;
import springboot.nexus.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAStudents() {
        return studentRepository.findAll();
    }
}
