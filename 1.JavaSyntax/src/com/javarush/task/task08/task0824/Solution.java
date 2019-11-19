package com.javarush.task.task08.task0824;
import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humens = new ArrayList<Human>();
        ArrayList<Human> parents1 =new ArrayList<>();
        ArrayList<Human> parents2 =new ArrayList<>();
        ArrayList<Human> children = new ArrayList<Human>();
        Human child1 = new Human("Petya", true, 25,new ArrayList<Human>());
        Human child2 = new Human("Kolya", false, 15,new ArrayList<Human>());
        Human child3 = new Human("Lena", true, 21,new ArrayList<Human>());
        children.add(child1);
        children.add(child2);
        children.add(child3);
        humens.add(child1);
        humens.add(child2);
        humens.add(child3);
        Human father = new Human("father1", true, 55, children);
        Human mather = new Human("mather1", false, 50, children);
        parents1.add(father);
        parents2.add(mather);
        Human grandFather1 = new Human("ded1", true, 85,parents1);
        Human grandFather2 = new Human("ded2", true, 79,parents2);
        Human grandMather1 = new Human("baba1", false, 81,parents1);
        Human grandMather2 = new Human("baba2", false, 78,parents2);
        humens.add(father);
        humens.add(mather);
        humens.add(grandFather1);
        humens.add(grandFather2);
        humens.add(grandMather1);
        humens.add(grandMather2);
        System.out.println(grandFather1.toString());
        System.out.println(grandMather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMather2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
       System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        //напишите тут ваш код
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human() {
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
