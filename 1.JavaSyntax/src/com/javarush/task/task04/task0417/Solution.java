package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(String.valueOf(br.readLine()));
        int b = Integer.parseInt(String.valueOf(br.readLine()));
        int c = Integer.parseInt(String.valueOf(br.readLine()));
        if(a==b && b ==c){
            System.out.println(a+" "+b+" "+c);
        }else
            if(a==b){
                System.out.println(a+" "+b);
            }
            else if(a==c){
                System.out.println(a+" "+c);
            }else
            if(b==c){
                System.out.println(b+" "+c);
            }
        //напишите тут ваш код
    }
}