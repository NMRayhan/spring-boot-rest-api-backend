package springboot.nexus.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.nexus.crud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
