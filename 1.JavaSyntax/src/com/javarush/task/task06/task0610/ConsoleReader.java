package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        return string;
    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        return number;

    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double number2 = Double.parseDouble(br.readLine());
        return number2;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean boolean1 = Boolean.parseBoolean(br.readLine());
        return boolean1;

    }

    public static void main(String[] args) throws Exception {

    }
}
