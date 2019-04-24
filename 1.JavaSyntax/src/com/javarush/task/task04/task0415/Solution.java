package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(String.valueOf(br.readLine()));
        int b = Integer.parseInt(String.valueOf(br.readLine()));
        int c = Integer.parseInt(String.valueOf(br.readLine()));
        if (a+b<=c||a+c<=b||b+c<=a)
        System.out.println("Треугольник не существует." );
        else System.out.println("Треугольник существует.");//напишите тут ваш код
    }
}