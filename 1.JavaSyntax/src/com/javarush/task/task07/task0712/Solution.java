package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int min = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= min) {
                min = list.get(i).length();
            }
        }
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= max) {
                max = list.get(i).length();

            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            } else if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }



        }
    }
}


