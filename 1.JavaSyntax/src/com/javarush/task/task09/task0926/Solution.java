package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> masivy = new ArrayList<>();
        int[] mas1 = new int[5];
        int[] mas2 = new int[2];
        int[] mas3 = new int[4];
        int[] mas4 = new int[7];
        int[] mas5 = new int[0];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            mas1[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 2; i++) {
            mas2[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 4; i++) {
            mas3[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 7; i++) {
            mas4[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 0; i++) {
            mas5[i] = rand.nextInt(100);
        }
        masivy.add(mas1);
        masivy.add(mas2);
        masivy.add(mas3);
        masivy.add(mas4);
        masivy.add(mas5);
        return masivy;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
