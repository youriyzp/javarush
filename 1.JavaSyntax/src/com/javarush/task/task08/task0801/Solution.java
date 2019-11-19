package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(10);
        stringSet.add("арбуз");
        stringSet.add("банан");
        stringSet.add("вишня");
        stringSet.add("груша");
        stringSet.add("дыня");
        stringSet.add("ежевика");
        stringSet.add("женьшень");
        stringSet.add("земляника");
        stringSet.add("ирис");
        stringSet.add("картофель");
        for (String text : stringSet) {
            System.out.println(text);
        }
    }
}
