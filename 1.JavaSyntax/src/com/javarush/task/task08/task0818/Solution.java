package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ikar", 200);
        map.put("Ivan", 500);
        map.put("Nicola", 700);
        map.put("Serg", 600);
        map.put("Petr", 100);
        map.put("Maks", 5000);
        map.put("Dimon", 2000);
        map.put("Anton", 300);
        map.put("Maria", 800);
        map.put("Youliya", 400);
        return map;
        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
            //напишите тут ваш код
        }
    }

    public static void main(String[] args) {
//            Map<String, Integer> map = createMap();
//            removeItemFromMap(map);
//                    System.out.println(map);

    }
}