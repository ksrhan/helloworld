package com.kosta.helloworld;

import javax.persistence.*;

@Entity(name = "student")
public class Student {

    @Id @Column @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    public void cleaning(){
        System.out.println(name+": Yes, I'm cleaning :(");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
