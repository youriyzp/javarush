package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/


public class Circle {
    int centerX;
    int centerY;
    int centerZ;
    int radius;
    int width;
    int color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = 0;
        this.radius = radius;
        this.width = 0;
        this.color = 0;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = 0;
        this.radius = radius;
        this.width = width;
        this.color = 0;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.centerZ = 0;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
