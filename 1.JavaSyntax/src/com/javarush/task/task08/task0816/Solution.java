package com.javarush.task.task08.task0816;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Duck", dateFormat.parse("AUGUST 12 2011"));
        map.put("Dim", dateFormat.parse("MARCH 21 2012"));
        map.put("Dir", dateFormat.parse("MAY 13 2011"));
        map.put("Dik", dateFormat.parse("July 11 2011"));
        map.put("Gir", dateFormat.parse("MAY 13 2012"));
        map.put("Levinski", dateFormat.parse("MAY 12 2011"));
        map.put("Bulba", dateFormat.parse("MAY 4 2011"));
        map.put("Bogun", dateFormat.parse("JULY 5 2012"));
        map.put("Sirko", dateFormat.parse("JUNE 5 2011"));
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            long mounts = date.getMonth();

            if (mounts == Calendar.JUNE || mounts == Calendar.JULY || mounts == Calendar.AUGUST)
                iterator.remove();
        }
    }


    public static void main(String[] args) {


    }
}
