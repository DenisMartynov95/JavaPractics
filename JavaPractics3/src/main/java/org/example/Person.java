package org.example;

public class Person {
    private int age; //Private - поле может быть изменено и доступно только внутри данного класса Person, нужны геттеры и сеттеры\
    private String  name;
    private String surname;

    public Person() { //В объекте будет ничего

    }

    public Person(int age){ //В объекте будет только возраст
        this.age = age;
    }

    public Person(int age, String name, String surname) { //В объекте будут все переменные
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    public void printAllInfo() {
            System.out.println("age=" + age +  ", name=" + name +  ", surname=" + surname);
        }

    }
