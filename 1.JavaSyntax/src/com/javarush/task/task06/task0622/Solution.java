package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int buffer;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numbers.length; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[i]) {
                    buffer = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = buffer;
                }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
