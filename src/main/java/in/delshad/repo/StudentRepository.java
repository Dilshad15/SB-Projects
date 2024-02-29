package in.delshad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.delshad.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
