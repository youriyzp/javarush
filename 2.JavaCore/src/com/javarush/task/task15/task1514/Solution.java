package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(4d,"m");
        labels.put(42d,"f");
        labels.put(15d,"f");
        labels.put(5d,"f");
        labels.put(47d,"f");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
