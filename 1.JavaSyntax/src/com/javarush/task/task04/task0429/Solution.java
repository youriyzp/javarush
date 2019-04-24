package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int a=Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d=0;
        int otr=0;
        if (a<0)otr=otr+1;
        else if(a!=0) d=d+1;
        if(b<0)otr=otr+1;
        else if(b!=0)d=d+1;
        if(c<0)otr=otr+1;
        else if(c!=0) d=d+1;
        System.out.println("количество отрицательных чисел: "+otr);
        System.out.println("количество положительных чисел: "+d);


    }
}
