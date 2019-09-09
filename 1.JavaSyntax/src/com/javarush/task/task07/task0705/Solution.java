package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigNumbers = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigNumbers.length; i++) {
            bigNumbers[i] = Integer.parseInt(br.readLine());
        }
        int[] firstSmallNambers = new int[10];
        int[] secondSmallNambers = new int[10];
        for (int i = 0; i < firstSmallNambers.length; i++) {
            firstSmallNambers[i] = bigNumbers[i];
        }
        for (int i = 0; i < secondSmallNambers.length; i++) {
            secondSmallNambers[i] = bigNumbers[i + 10];
            System.out.println(secondSmallNambers[i]);
        }
    }
}
