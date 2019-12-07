package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        Date date1 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("y-MM-d");
        date1 = dateFormat.parse(date);
        dateFormat = new SimpleDateFormat("MMM dd, y ", Locale.ENGLISH);
        System.out.println(dateFormat.format(date1).toUpperCase());
        //напишите тут ваш код
    }
}
