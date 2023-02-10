package springboot.nexus.crud.service;

import springboot.nexus.crud.model.Teacher;

import java.util.List;

public interface TeacherService {
    public Teacher saveTeacher(Teacher teacher);

    public List<Teacher> getAllTeacher();
}
