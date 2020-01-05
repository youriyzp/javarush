package com.javarush.task.task13.task1318;

import java.io.*;


/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(nameFile);

        int i;

        while ((i = fileInputStream.read()) != -1) {

            System.out.print((char) i);
        }
        fileInputStream.close();
        reader.close();// напишите тут ваш код
    }


}