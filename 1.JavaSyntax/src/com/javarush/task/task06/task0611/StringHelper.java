package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s + s + s + s + s;
        return result;
    }

    public static String multiply(String s, int count) {
        String m = "";
        for (int c = 0; c < count; c++) {

            m = m.concat(s);
        }

        String result = m;
        return result;
    }

    public static void main(String[] args) {


    }
}
