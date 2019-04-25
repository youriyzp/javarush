package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
