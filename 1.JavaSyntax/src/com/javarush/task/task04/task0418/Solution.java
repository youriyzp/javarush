package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in)) ;
       int a=Integer.parseInt(String.valueOf(br.readLine()));
       int b= Integer.parseInt(String.valueOf(br.readLine()));
       if (a<=b) {
           System.out.println(a);
       }else
           System.out.println(b);
       //напишите тут ваш код
    }
}