package com.kosta.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    StudentService ss;

    public StudentService getSs() {
        return ss;
    }

    @Autowired
    public void setSs(StudentService ss) {
        this.ss = ss;
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void joinStudent(@RequestBody Student student){
        ss.joinStudent(student);
    }
}
