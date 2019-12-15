package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> ar1 = new ArrayList<String>(2);
        ArrayList<String> ar2 = new ArrayList<String>(2);
        ArrayList<String>[] arrayList = new ArrayList[2];
        ar1.add("eeee");
        ar1.add("daaa");
        ar2.add("salo");
        ar2.add("sila");
        arrayList[0] = ar1;
        arrayList[1] = ar2;
        //напишите тут ваш код
        return arrayList;

    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}