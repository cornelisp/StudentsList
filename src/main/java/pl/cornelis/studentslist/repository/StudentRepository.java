package pl.cornelis.studentslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.cornelis.studentslist.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {


    Student findByFirstName(String firstName);
}
