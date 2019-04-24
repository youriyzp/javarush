package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        int a=Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        int d=0;
        if (a<=0){}
        else d=d+1;
            if(b<=0){}
            else d=d+1;
                if(c<=0){}else d=d+1;
        System.out.println(d);

    }
}
