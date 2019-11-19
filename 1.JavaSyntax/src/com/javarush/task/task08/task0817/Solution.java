package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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
        //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> iterator = copy.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            for (Map.Entry<String, String> value : copy.entrySet()) {
                if (value.getKey() != pair.getKey() && value.getValue().equals(pair.getValue())) {
                    removeItemFromMapByValue(map, pair.getValue());
                    // map.remove(pair.getKey());
                }


            }
        }
        //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }


    public static void main(String[] args) {
//        Map<String, String> map = createMap();
//        Map<String, String> map2 = createMap();
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
//        // map.size();
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }
//        removeItemFromMapByValue(map2,"Taras");
//        System.out.println(map2);
    }

}
