package net.javaguides.sms.service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public void createStudent(Student student) {

    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
