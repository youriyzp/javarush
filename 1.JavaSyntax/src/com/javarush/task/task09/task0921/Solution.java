package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while (true) {
                int a = Integer.parseInt(br.readLine());
                arrayList.add(a);
            }
        } catch (Exception e) {
            for (Integer chisla : arrayList) {
                System.out.println(chisla);
            }
        }
    }
    //напишите тут ваш код
}

