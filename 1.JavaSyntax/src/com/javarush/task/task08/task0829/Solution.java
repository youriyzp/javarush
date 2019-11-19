package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> townsAndFamily = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            townsAndFamily.put(town, family);
        }
        String city = reader.readLine();
        for (Map.Entry<String, String> str : townsAndFamily.entrySet()) {
            if (city.equals(str.getKey())) {
                System.out.println(str.getValue());
            }
        }
    }


}