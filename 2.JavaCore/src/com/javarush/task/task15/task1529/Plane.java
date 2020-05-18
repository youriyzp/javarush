package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    public int quantity;

    public Plane() {
    }
    public Plane(int quantity){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void fly() {

    }
}
