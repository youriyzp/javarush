package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void divideByZero() throws ArithmeticException {
        int a = 7;
        int c = a / 0;
        System.out.println(c);
    }
}