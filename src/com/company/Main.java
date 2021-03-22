package com.company;

import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setAuto(new Toyota());

        Car car2 = new Car();
        car2.setAuto(new Crossover());

        Car car3 = new Car();
        car3.setAuto(new Mersedes());

        Car car4 = new Car();
        car4.setAuto(new Porshe());


        Garage<Porshe> porsheGarage = new Garage<>();
        porsheGarage.setAuto(new Porshe());
        porsheGarage.print();
        setIfNull(new Garage<Toyota>(),new Toyota());

        Garage<Crossover> crossoverGarage = new Garage<>();
        crossoverGarage.setAuto(new Crossover());
        crossoverGarage.print();
        setIfNull(new Garage<Porshe>(), new Porshe());

        Garage<Toyota> toyotaGarage = new Garage<>();
        toyotaGarage.setAuto(new Toyota());
        toyotaGarage.print();
        setIfNull(new Garage<Mersedes>(), new Mersedes());

        Garage<Mersedes> mersedesGarage = new Garage<>();
        mersedesGarage.setAuto(new Mersedes());
        mersedesGarage.print();
        setIfNull(new Garage<Crossover>(), new Crossover());
    }

    public static <T > void setIfNull (Garage < T > car, T t){
            if (car.getAuto() == null) {
                car.setAuto(t);
                System.out.println("В гараже есть " + t.getClass().getSimpleName());
            }
    }
}
