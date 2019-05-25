package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            String sms;
            double imt=weight/(height*height);
            if (imt<18.5)sms="Недовес: меньше чем 18.5";else
                if(imt>=18.5&&imt<25)sms="Нормальный: между 18.5 и 25";else
                    if (imt>=25&&imt<30)sms="Избыточный вес: между 25 и 30";else
                        sms="Ожирение: 30 или больше";
            System.out.println(sms);
        }
    }
}
