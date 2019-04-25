package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
      for (int i=0;i<10;i++) {
         System.out.println(name+ " любит меня.");
      } //напишите тут ваш код

    }
}
