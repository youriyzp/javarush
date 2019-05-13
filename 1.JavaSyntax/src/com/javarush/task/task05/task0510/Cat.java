package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    String address;
    int weight;
    int age;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 4;
        this.color = "grey";

    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";


    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "grey";

    }

    public void initialize(int weight, String color) {

        this.weight = weight;
        this.color = color;

        this.age = 4;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.age = 4;
        this.color = color;
        this.address = address;


    }


    public static void main(String[] args) {

    }
}
