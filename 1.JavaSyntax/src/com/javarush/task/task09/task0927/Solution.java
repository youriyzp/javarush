package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("1cat", new Cat("Laska"));
        map.put("2cat", new Cat("Boris"));
        map.put("3cat", new Cat("Chernish"));
        map.put("4cat", new Cat("Musya"));
        map.put("5cat", new Cat("Busya"));
        map.put("6cat", new Cat("Rusya"));
        map.put("7cat", new Cat("Kisa"));
        map.put("8cat", new Cat("Fika"));
        map.put("9cat", new Cat("Lagom"));
        map.put("10cat", new Cat("Hyuge"));
        return map; //напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>();
        catSet.addAll(map.values());
        return catSet;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
