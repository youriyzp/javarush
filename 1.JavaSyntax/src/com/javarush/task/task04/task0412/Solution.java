package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String chislo;
        chislo = br.readLine();
        int number = Integer.parseInt(String.valueOf(chislo));
        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else System.out.println(0);


        //напишите тут ваш код

    }

}