package com.company;

public class Garage <T> implements Printable <T> {

    private T auto;

    public T getAuto() {
        return auto;
    }

    public void setAuto(T auto) {
        this.auto = auto;
    }


    @Override
    public T print() {
        return null;
    }



}
