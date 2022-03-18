/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;



/**
 *
 * @author gaurav
 */
public class Person {
    private int id;
    private int age;
    private char gender;
    private String name;
    private House house;
    private Long phoneNumber;

    public Person(int id, int age, char gender, String name, House house,Long phoneNumber) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.house = house;
        this.phoneNumber = phoneNumber;
    }
       


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
