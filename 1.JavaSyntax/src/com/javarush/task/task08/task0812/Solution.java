package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>(10);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(br.readLine()));
        }
        int max = 1;
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (count > max) {
                    max = count;

                }
            } else count = 1;
        }
        System.out.println(max);
    }
}