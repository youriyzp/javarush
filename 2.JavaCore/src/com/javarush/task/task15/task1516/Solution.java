package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public Solution(int intVar, double doubleVar, Double doubleVar1, boolean booleanVar, Object objectVar, Exception exceptionVar, String stringVar) {
        this.intVar = intVar;
        this.doubleVar = doubleVar;
        DoubleVar = doubleVar1;
        this.booleanVar = booleanVar;
        ObjectVar = objectVar;
        ExceptionVar = exceptionVar;
        StringVar = stringVar;
    }

    public  int intVar;
   public  double doubleVar;
    public  Double DoubleVar;
    public  boolean booleanVar ;
    public  Object ObjectVar ;
    public   Exception ExceptionVar ;
    public  String StringVar ;

    public Solution() {

    }


    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.intVar);
        System.out.println(s.doubleVar);
        System.out.println(s.DoubleVar);
        System.out.println(s.booleanVar);
        System.out.println(s.ObjectVar);
        System.out.println(s.ExceptionVar);
        System.out.println(s.StringVar);
    }
}
