package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s = null;
            int x = s.length();

        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"));
            String firstString = reader.readLine();
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            String s = null;
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[3];
            array[3] = 1;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();

        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            new Solution().clone();
        } catch (CloneNotSupportedException e) {
            exceptions.add(e);
        }
        try {
            URL url = new URL("");
        } catch (MalformedURLException e) {
            exceptions.add(e);
        }
        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            throw new SecurityException();

        } catch (SecurityException e) {
            exceptions.add(e);
        }
        //напишите тут ваш код
    }
}
