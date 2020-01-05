package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consolReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = consolReader.readLine();
        consolReader.close();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));
        ArrayList<Integer> chetChisla = new ArrayList();
        while (fileReader.ready()) {
            String input = fileReader.readLine();
            if (!input.isEmpty()) {
                Integer number = Integer.parseInt(input);
                if (number % 2 == 0)
                    chetChisla.add(number);
            }
        }
        fileReader.close();
        // напишите тут ваш код
        Collections.sort(chetChisla);
        for (int item : chetChisla) {
            System.out.println(item);
        }

    }
}
