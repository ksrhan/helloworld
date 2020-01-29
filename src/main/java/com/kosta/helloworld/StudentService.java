package com.kosta.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository sr;

    public StudentRepository getSr() {
        return sr;
    }

    @Autowired
    public void setSr(StudentRepository sr) {
        this.sr = sr;
    }

    public void joinStudent(Student student){
        //어떤 방법을 썼는지는 모르지만 저장하고 싶다..
        sr.save(student);
    }

    public List<Student> findStudentByName(String name){
        return sr.findByName(name);
    }
}
