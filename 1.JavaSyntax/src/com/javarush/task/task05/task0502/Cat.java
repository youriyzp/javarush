package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

       if (anotherCat.strength<this.strength||anotherCat.weight<this.weight||anotherCat.age<this.age)
       return true;
       else return  false;

        //напишите тут ваш код
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.weight = 1;
        cat1.strength = 1;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 2;
        cat2.strength = 2;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));


    }
}
