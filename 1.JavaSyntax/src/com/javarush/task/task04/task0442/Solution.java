package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        while (true) {
            int nbr1 = Integer.parseInt(br.readLine());
            sum=sum+nbr1;
            if (nbr1 == -1) {
                break;
            }


        }
        System.out.println(sum);
    }
}
