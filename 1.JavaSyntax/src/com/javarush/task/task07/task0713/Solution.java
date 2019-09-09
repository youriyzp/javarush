package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            String s = br.readLine();
            int x = Integer.parseInt(s);
            list.add(x);
        }
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 3 == 0) {
                list3.add(list.get(i));
                if (list.get(i) % 2 == 0)
                    list2.add(list.get(i));
            } else if (list.get(i) % 2 == 0)
                list2.add(list.get(i));
            else
                list4.add(list.get(i));
        }
        printList(list3);
        printList(list2);
        printList(list4);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
