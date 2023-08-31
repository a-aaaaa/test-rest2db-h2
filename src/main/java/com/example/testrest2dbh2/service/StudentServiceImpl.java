package com.example.testrest2dbh2.service;

import com.example.testrest2dbh2.dao.StudentDao;
import com.example.testrest2dbh2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}
