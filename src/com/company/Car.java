package com.company;

public class Car {

    private Object  auto;

    public Object getAuto() {
        return auto;
    }

    public void setAuto(Object auto) {
        this.auto = auto;
    }
}

class Crossover extends Car {};
class Toyota extends Car {};
class Mersedes extends Car {};
class Porshe extends Car {};