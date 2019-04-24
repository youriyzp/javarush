package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i <= 99) {
            System.out.print("S");
            i++;
            if (i % 10 == 0) {
                System.out.println();
            }

        }
    }
}
