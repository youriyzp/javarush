package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
       int a= Integer.parseInt(String.valueOf(br.readLine()));
       int b = Integer.parseInt(String.valueOf(br.readLine()));
       int c= Integer.parseInt(String.valueOf(br.readLine()));
       int d =Integer.parseInt(String.valueOf(br.readLine()));
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));//напишите тут ваш код
    }
}
