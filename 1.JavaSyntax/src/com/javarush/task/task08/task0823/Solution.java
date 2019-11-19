package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String string2 = string.trim().replaceAll(" +", " ");
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        String delimeter = " ";
        String[] words = string2.split(delimeter);
        list.addAll(Arrays.asList(words));
        for (int i = 0; i < list.size(); i++) {
            String wordList = list.get(i);
            int lenght = wordList.length();
            list2.add(wordList.substring(0, 1).toUpperCase() + wordList.substring(1, lenght));
        }
        for (String word : list2) {
            System.out.print(word + " ");
        }

    }
    //напишите тут ваш код
}

