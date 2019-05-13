package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double srar = 0;
        int i = 0;
        while (true) {
            int nmbr = Integer.parseInt(br.readLine());
            if (nmbr == -1) break;
            srar = srar + nmbr;
            i++;
        }
        System.out.println(srar / i);
    }
}

