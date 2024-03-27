package org.example;


import org.example.company.*;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("Base car", 8);
//        printStartEngine(car);
//
//        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);
//        printStartEngine(mitsubishi);
//
//        Car ford = new Ford("Ford Falcon", 6);
//        printStartEngine(ford);
//
//        Car holden = new Holden("Holden Commodore", 6);
//        printStartEngine(holden);

    }

    private static void printStartEngine(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}