package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String  url2=br.readLine();
        br.close();
               String test = url2.split("\\?")[1];
        if (url2.matches("(.*)obj(.*)")) {
            //String test = url.split("\\?")[1];
            for (String retval : test.split("&")) {
                System.out.print(retval.split("=")[0] + " ");
            }
            System.out.println();
            for (String retval : test.split("&")) {
                if (retval.matches("(.*)obj(.*)")) {
                    try {
                        double value = Double.parseDouble(retval.split("\\=")[1]);
                        Solution.alert(value);
                    } catch (Exception e) {
                        String value = retval.split("\\=")[1];
                        Solution.alert(value);
                    }
                }
            }
        } else
            //   String test = url.split("\\?")[1];
            for (String retval : test.split("&")) {

                System.out.print(retval.split("=")[0] + " ");
            }
        System.out.println();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }
    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

