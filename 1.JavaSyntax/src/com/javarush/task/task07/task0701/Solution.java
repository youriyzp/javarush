package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] initializeArray = new int[20];
        for (int i = 0; i < initializeArray.length; i++) {
            initializeArray[i] = Integer.parseInt(br.readLine());
        }// создай и заполни массив
        return initializeArray;
    }

    public static int max(int[] array) {
        int max=array[0];
        for (int i = 0; i < array.length; i++) {

            // найди максимальное значение
            if (array[i] >  max)max=array[i];
                    }
        return max;}
}