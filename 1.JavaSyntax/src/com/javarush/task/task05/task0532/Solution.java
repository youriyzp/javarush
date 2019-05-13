package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int a = 1;
        int maximum = Integer.parseInt(reader.readLine());
        while (a < n) {
            int x = Integer.parseInt(reader.readLine());

            a = a + 1;

            if (x > maximum) maximum = x;
        }

        System.out.println(maximum);
    }
}
