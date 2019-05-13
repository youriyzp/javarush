package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1= new Cat("Boss",10,18,18);
        Cat cat2= new Cat("Ass",8,14,10);
        Cat cat3= new Cat("Kitty",1,4,3);
       //напишите тут ваш код
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}