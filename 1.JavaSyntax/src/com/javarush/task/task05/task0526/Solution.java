package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    public static void main(String[] args) {
        Man man = new Man("roma", 25, "kiev");
        Man man2 = new Man("sasha", 35, "zp");
        System.out.println(man);
        System.out.println(man2);
        Woman woman = new Woman("lisa", 15, "dnepr");
        Woman woman1 = new Woman("tanya", 20, "odessa");
        System.out.println(woman);
        System.out.println(woman1);

    }

    public static class Man {
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }


        public String toString() {
            return name + " " + age + " " + address;
        }


    }

}
