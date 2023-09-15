package chapter9;

import java.sql.SQLOutput;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person() {
        System.out.println("In a person default constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
