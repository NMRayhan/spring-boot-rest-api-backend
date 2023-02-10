package springboot.nexus.crud.service;

import org.springframework.stereotype.Service;
import springboot.nexus.crud.model.Teacher;
import springboot.nexus.crud.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }
}
