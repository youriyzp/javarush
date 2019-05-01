package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int avg;
        if(n1>n2&&n1<n3||n1<n2&&n1>n3||n1==n2)avg=n1;else
            if(n2>n1&&n2<n3||n2<n1&&n2>n3||n2==n3)avg=n2; else
                 avg =n3;
        System.out.println(avg);

    }
}
