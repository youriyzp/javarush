package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(String.valueOf(br.readLine()));
        double b = Double.parseDouble(String.valueOf(br.readLine()));
        double c = Double.parseDouble(String.valueOf(br.readLine()));

        double max = a;
        double min = b;
        double avg = c;
        if (a > b) {
            max = a;
        } else max = b;
        if (max < c) {
            max = c;
            if (a > b) {
                avg = a;
            } else avg = b;
        }
        if (a < b) {
            min = a;
        } else min = b;
        if (min > c) {
            min = c;
            if (a > b) {
                avg = b;
            } else avg = a;
        }
        if (c > a && c < b || c > b && c < a) {
            avg = c;
        }


        System.out.println(max + " " + avg + " " + min);
    }


}
