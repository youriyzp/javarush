package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        String y=br.readLine();
        String m=br.readLine();
        String d=br.readLine();
        System.out.println("Меня зовут " +name+"."+"\n" +
                "Я родился "+d+"."+m+"."+y);
    }
}
