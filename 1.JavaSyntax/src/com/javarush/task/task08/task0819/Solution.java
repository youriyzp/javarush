package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        printCats(cats);
        Iterator<Cat> iterator = cats.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();

        }

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);

    }

    public static Set<Cat> createCats() {
        Cat cat = new Cat("ghut");
        Cat cat2 = new Cat("yttt");
        Cat cat3 = new Cat("mmmm");
        Set<Cat> cats = new HashSet<Cat>(3);
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
//      напишите тут ваш код. step 2 - пункт 2
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        // step 4 - пункт 4
    }

    public static class Cat {
        private String name;

        public Cat(String value) {
            name = value;
        }

        public Cat() {
        }


        // step 1 - пункт 1
    }
}
