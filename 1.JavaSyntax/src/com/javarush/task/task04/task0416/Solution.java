package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(String.valueOf(br.readLine()));
        if (t % 5 < 3) {
            System.out.println("зелёный");//напишите тут ваш код
        } else if (t % 5 < 4) {
            System.out.println("жёлтый");
        } else
            System.out.println("красный");

    }
}