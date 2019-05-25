package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String string = String.valueOf(n);
        char[] array = string.toCharArray();
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else odd++;

        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);

    }
}
