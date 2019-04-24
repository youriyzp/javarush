package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
      System.out.println("Введите имя: ");
      Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
      for (int i=0;i<10;i++) {
         System.out.println(name+ " любит меня.");
      } //напишите тут ваш код

    }
}
