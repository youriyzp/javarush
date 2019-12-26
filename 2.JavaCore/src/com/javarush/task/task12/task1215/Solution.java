package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        private String name;
        private Pet child;

        public String getName() {
            return this.name;
        }

        public Pet getChild() {
            return this.child;
        }
    }

    public static class Dog extends Pet {
        private String name;
        private Pet child;

        public String getName() {
            return this.name;
        }

        public Pet getChild() {
            return this.child;
        }

    }

}
