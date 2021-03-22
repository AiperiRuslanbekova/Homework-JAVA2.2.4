package com.company;

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

        if (car1.getAuto() instanceof Toyota) {
            Toyota toyota = (Toyota) car1.getAuto();
            System.out.println("Выбираем Toyota");
        }
        if (car2.getAuto() instanceof Porshe) {
            Porshe porshe = (Porshe) car2.getAuto();
            System.out.println("Выбираем Porshe");
        }
        if (car3.getAuto() instanceof Mersedes) {
            Mersedes mersedes = (Mersedes) car3.getAuto();
            System.out.println("Выбираем Mersedes");
        }
        if (car4.getAuto() instanceof Crossover){
            Crossover crossover = (Crossover) car4.getAuto();
            System.out.println("Выбираем Crossover");
        }

        Garage<Car> car = new Garage<>();
        car.setAuto(new Car());
        setIfNull(new Garage<Crossover>(), new Crossover());
    }
    
    public static <T > void setIfNull(Garage < T > car, T t){
            if (car.getAuto() == null) {
                car.setAuto(t);
                System.out.println("В гараже есть " + t.getClass().getSimpleName());
            }
    }
}
