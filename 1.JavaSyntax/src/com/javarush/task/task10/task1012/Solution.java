package com.javarush.task.task10.task1012;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        int index = 0;
        String listToString = list.toString();
        char[] stringTochar = listToString.toCharArray();
        for (int j = 0; j < alphabet.size(); j++) {
            for (int i = 0; i < stringTochar.length; i++) {

                if (alphabet.get(j) == stringTochar[i]) {
                    index += 1;

                }
            }
            System.out.println(alphabet.get(j) + " " + index);
            index = 0;
        }
        // напишите тут ваш код
    }
}
