package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String monthInput = reader.readLine();
        Map<String, Integer> monthOfYear = new HashMap<>(12);
        monthOfYear.put("January", 1);
        monthOfYear.put("February", 2);
        monthOfYear.put("March", 3);
        monthOfYear.put("April", 4);
        monthOfYear.put("May", 5);
        monthOfYear.put("June", 6);
        monthOfYear.put("July", 7);
        monthOfYear.put("August", 8);
        monthOfYear.put("September", 9);
        monthOfYear.put("October", 10);
        monthOfYear.put("November", 11);
        monthOfYear.put("December", 12);

        for (Map.Entry<String, Integer> str : monthOfYear.entrySet()) {
            if (monthInput.equals(str.getKey())) {
                System.out.println(str.getKey() + " is the " + str.getValue() + " month");
            }
        }
    }
}

