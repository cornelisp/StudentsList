package pl.cornelis.studentslist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cornelis.studentslist.entity.Student;
import pl.cornelis.studentslist.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudent() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByFirstName(String firstName) {
        return repository.findByFirstName(firstName);
    }

    public String deleteStudent(int id) {
         repository.deleteById(id);
         return "Student deleted successfully on id: " + id;
    }

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId()).orElse(null);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setFaculty(student.getFaculty());
        existingStudent.setSemester(student.getSemester());
        return repository.save(existingStudent);
    }

}
