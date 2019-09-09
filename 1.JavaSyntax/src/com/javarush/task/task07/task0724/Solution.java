package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Nicola", true, 65);
        Human grandFather2 = new Human("Anton", true, 72);
        Human grandMather1 = new Human("Anna", false, 60);
        Human grandMather2 = new Human("Ilona", false, 66);
        Human father = new Human("Anton", true, 72, grandFather1, grandMather1);
        Human mather = new Human("Nicola", true, 65, grandFather2, grandMather2);
        Human child1 = new Human("Vasya", true, 12, father, mather);
        Human child2 = new Human("Petya", true, 12, father, mather);
        Human child3 = new Human("Sonya", false, 12, father, mather);
        System.out.println(grandFather1.toString() + "\n" + grandFather2.toString() + "\n" + grandMather1.toString() + "\n" +
                grandMather2.toString() + "\n" + father.toString() + "\n" + mather.toString() + "\n" + child1.toString() + "\n" + child2.toString() + "\n" +
                child3.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}