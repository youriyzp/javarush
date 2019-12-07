package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
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
        for (int j = 0; j < array.length; j++){

            for (int i = 0; i < array.length; i++){

                if (isNumber(array[j]) == false && isNumber(array[i]) == false){
                    if (isGreaterThan(array[j],array[i])){
                    }
                    else{
                        String min = array[i];
                        array[i] = array[j];
                        array[j] = min;
                    }
                }
                else if(isNumber(array[j]) == true && isNumber(array[i]) == true){
                    int one = Integer.parseInt(array[i]);
                    int two = Integer.parseInt(array[j]);
                    if (one > two){
                    }
                    else if (two > one){
                        String min = array[j];
                        array[j] = array[i];
                        array[i] = min;
                    }
                }
                else{
                }
            }
        }
    }

    // напишите тут ваш код


                // Метод для сравнения строк: 'а' больше чем 'b'
                public static boolean isGreaterThan (String a, String b){
                    return a.compareTo(b) > 0;
                }


                // Переданная строка - это число?
                public static boolean isNumber (String s){
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
