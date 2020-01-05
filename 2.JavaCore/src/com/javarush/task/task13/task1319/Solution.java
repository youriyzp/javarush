package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        File file = new File(nameFile);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String textToWrite = reader.readLine();
        while (true) {
            bufferedWriter.write(textToWrite + "\n");
            if (!textToWrite.equals("exit")) {
                textToWrite = reader.readLine();
            } else break;
            // напишите тут ваш код
        }
        bufferedWriter.close();
        reader.close();

    }

}
