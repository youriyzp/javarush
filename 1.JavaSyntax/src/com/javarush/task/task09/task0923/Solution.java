package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String text2 = text.replace(" ", "");
        char[] textToChar = text2.toCharArray();
        ArrayList<Character> glasn = new ArrayList<>();
        ArrayList<Character> soglasn = new ArrayList<>();

        for (char element : textToChar) {
            if (isVowel(element)) {
                glasn.add(element);
            } else soglasn.add(element);
        }

        for (Character element : glasn) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (Character element : soglasn) {
            System.out.print(element + " ");
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}