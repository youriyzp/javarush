package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] massiv = new String[10];
        for (int i = 0; i < 8; i++) {
            massiv[i] = br.readLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(massiv[9 - i]);
        }
    }
}