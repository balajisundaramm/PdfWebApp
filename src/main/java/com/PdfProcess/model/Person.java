package com.PdfProcess.model;

/**
 * Created by Balaji on 7/10/17.
 */
public class Person {
    private String name;
    private int age;
    private String profession;

    public Person() {
    }

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession=profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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
