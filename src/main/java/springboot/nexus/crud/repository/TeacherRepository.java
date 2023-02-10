package springboot.nexus.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.nexus.crud.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
