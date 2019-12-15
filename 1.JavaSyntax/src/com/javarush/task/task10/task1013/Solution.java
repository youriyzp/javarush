package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private boolean pol;
        private String name;
        private String surname;
        private int age;
        private int rost;
        private int ves;

        public Human() {

        }

        public Human(boolean pol) {
            this.pol = pol;
        }

        public Human(String name, int age, int rost) {
            this.name = name;
            this.age = age;
            this.rost = rost;
        }

        public Human(boolean pol, String name, int age, int rost, int ves) {
            this.pol = pol;
            this.name = name;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
        }

        public Human(boolean pol, String name, int age, int rost) {
            this.pol = pol;
            this.name = name;
            this.age = age;
            this.rost = rost;
        }

        public Human(boolean pol, String name, int age) {
            this.pol = pol;
            this.name = name;
            this.age = age;
        }

        public Human(boolean pol, String name) {
            this.pol = pol;
            this.name = name;
        }

        public Human(boolean pol, String name, String surname, int age, int rost, int ves) {
            this.pol = pol;
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
        }

        public Human(String surname, int age, int rost, int ves) {
            this.surname = surname;
            this.age = age;
            this.rost = rost;
            this.ves = ves;
        }

        public Human(String name, String surname, int age, int rost) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.rost = rost;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
