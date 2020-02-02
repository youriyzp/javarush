package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        while (true) {
            key = reader.readLine();
            if (key.equals("user")) {
                person = new Person.User();
                doWork(person);
                continue;
                //тут цикл по чтению ключей, пункт 1
            } else if (key.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
                continue;
            } else if (key.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
                continue;
            } else if (key.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
                continue;
            } else break;

        }
        reader.close();

        //создаем объект, пункт 2

        //doWork(person); //вызываем doWork

    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();// пункт 3
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();// пункт 3
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();// пункт 3
        } else
            ((Person.Proger) person).enjoy();// пункт 3

    }
}
