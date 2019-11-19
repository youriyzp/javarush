package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(15);
        set.add(80);
        set.add(23);
        set.add(5);
        set.add(7);
        set.add(-5);
        set.add(90);
        set.add(9);
        set.add(2);
        set.add(10);
        set.add(151);
        set.add(802);
        set.add(231);
        set.add(54);
        set.add(75);
        set.add(-55);
        set.add(906);
        set.add(97);
        set.add(28);
        set.add(107);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer n = iterator.next();
            if (n > 10) {
                iterator.remove();
            }
        }
        return set;
    }


    public static void main(String[] args) {
        Iterator iter = removeAllNumbersGreaterThan10(createSet()).iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
