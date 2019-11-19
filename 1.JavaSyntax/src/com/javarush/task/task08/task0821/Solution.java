package com.javarush.task.task08.task0821;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Klichko", "Vetal");
        map.put("Poroh", "Petro");
        map.put("Ptn", "Hulo");
        map.put("Ptn", "Pnh");
        map.put("Sirko", "Ivan");
        map.put("Shorko", "Ivan");
        map.put("Harkovskiy", "Ivan");
        map.put("Harkov", "Ann");
        map.put("Mazepa", "Ivan");
        map.put("Bandera", "Stepan");
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
