package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
           // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            InputStream inputStream = new FileInputStream(Statics.FILE_NAME);
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready()) {
                lines.add(br.readLine());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
