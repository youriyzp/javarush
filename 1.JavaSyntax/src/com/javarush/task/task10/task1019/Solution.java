package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        while (true) {
            String idString = reader.readLine();
            if (idString.isEmpty()) break;
            int id = Integer.parseInt(idString);
            String name = reader.readLine();
            if (idString.isEmpty()) {
                hashMap.put("", id);
                break;
            }

            hashMap.put(name, id);
        }
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getValue() + " ");
            System.out.println(me.getKey());
        }


    }
}

