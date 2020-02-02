package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) {
            throw new Exception();
        }
        int b = Integer.parseInt(reader.readLine());
        if (b <= 0) {
            throw new Exception();
        }

        reader.close();
        System.out.println(NOD(a, b));

    }

    public static int NOD(int a, int b) {
        int nod = 0;
        int max = 0;
        if (a < b) {
            max = b;
        } else max = a;

        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0)
                nod = i;
        }


        return nod;

    }
}
