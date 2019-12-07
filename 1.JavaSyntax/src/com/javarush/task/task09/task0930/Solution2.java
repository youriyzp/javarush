package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();
        ArrayList<String> sortValue = new ArrayList<>();
        int k = 0;
        int l = 0;
        for (String el : array
        ) {
            if (isNumber(el)) {
                numbers.add(Integer.parseInt(el));
                sortValue.add("1");
            } else {
                letters.add(el);
                sortValue.add("0");
            }
        }
        boolean isSorted = false;
        Integer s;
        String ss;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (!(numbers.get(i) > numbers.get(i + 1))) {
                    s = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, s);
                    isSorted = false;
                }
            }
        }
        boolean isSorted2 = false;
        while (!isSorted2) {
            isSorted2 = true;
            for (int i = 0; i < letters.size() - 1; i++) {
                if (isGreaterThan(letters.get(i), letters.get(i + 1))) {
                    ss = letters.get(i);
                    letters.set(i, letters.get(i + 1));
                    letters.set(i + 1, ss);
                    isSorted2 = false;
                }
            }
        }
        for (int i = 0; i < sortValue.size(); i++) {
            if (sortValue.get(i).equals("1")) {
                k = k + 1;
                array[i] = String.valueOf((numbers.get(k - 1)));
            } else {
                l = l + 1;
                array[i] = (letters.get(l - 1));
            }
        }
    }

    // напишите тут ваш код
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
