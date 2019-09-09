package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minIndex = left;
            for (int right = left + 1; right < array.length; right++) {
                if (array[right] > array[minIndex]) {
                    minIndex = right;
                }
            }
            if (minIndex != left) {
                int temp = array[left];
                array[left] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
