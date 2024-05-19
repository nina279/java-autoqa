package org.example.HW13;

import static org.example.HW13.UserGeneration.*;

public class Users {
    private String name;
    private Integer age;
    private String email;
    private String gender;

//Мій конструктор для стріму
    public Users(String name, Integer age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public static Users generateUser() {
        String name = generateName();
        Integer age = generateAge();
        String email = generateEmail();
        String gender = determineGender(name); // Визначаємо стать на основі імені
        return new Users(name, age, email, gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
