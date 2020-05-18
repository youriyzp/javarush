package com.javarush.task.task15.task1519;

import java.io.*;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!("exit".equals(line = br.readLine()))) {
            try {
                if (line.contains(".")) {
                    print(Double.parseDouble(line));
                } else if (Integer.valueOf(line) > 0 && Integer.valueOf(line) < 128)
                    print(Short.parseShort(line));
                else if (Integer.valueOf(line) <= 0 || Integer.valueOf(line) >= 128)
                    print(Integer.parseInt(line));

            } catch (NumberFormatException e) {
                print(line);
            }

        }


    }
    //напиште тут ваш код


    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
