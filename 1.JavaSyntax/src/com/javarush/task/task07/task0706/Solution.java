package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] houses = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < houses.length; i = i + 2) {
            chet = chet + houses[i];
        }

        for (int i = 1; i < houses.length; i = i + 2) {
            nechet = nechet + houses[i];
        }
        if (nechet > chet) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
