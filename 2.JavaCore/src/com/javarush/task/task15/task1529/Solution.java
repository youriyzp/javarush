package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String parametr_1 = null;
        // String parametr_2;
        // int par2;
        try {
            parametr_1 = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (parametr_1.equals("helicopter")) {
            result = new Helicopter();
        } else if (parametr_1.equals("plane")) {
            try {
                String parametr_2 = br.readLine();
                int par2 = Integer.parseInt(parametr_2);
                result = new Plane(par2);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }//add your code here - добавьте код тут
    br.close();
    }
}
