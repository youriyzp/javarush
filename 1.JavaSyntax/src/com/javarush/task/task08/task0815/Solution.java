package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Rokcfel", "John");
        map.put("Duck", "Donald");
        map.put("Dim", "Mobi");
        map.put("Dir", "John");
        map.put("Dik", "Rich");
        map.put("Gir", "Richard");
        map.put("Levinski", "Monika");
        map.put("Bulba", "Taras");
        map.put("Bogun", "Ivan");
        map.put("Sirko", "Ivan");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (name.equals(pair.getValue())) {
                count++;
            }
        }
        return count;
    }


    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
