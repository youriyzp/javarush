package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String l = String.valueOf(a);
        int lint = l.length();
        if (lint == 1&&a!=0) {
            if (a % 2 == 0) {
                System.out.println("четное однозначное число");
            } else System.out.println("нечетное однозначное число");
        } else if (lint == 2) {
            if (a % 2 == 0) {
                System.out.println("четное двузначное число");
            } else System.out.println("нечетное двузначное число");
        } else if (lint == 3) {
            if (a % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else System.out.println("нечетное трехзначное число");

        }
    }
}
