package com.javaproject2.chapter2;

public class Car {

    private double x = 0;
    private double liters;
    private double fuelСonsumption;

    public Car(double liters, double fuelСonsumption) {
        this.liters = liters;
        this.fuelСonsumption = fuelСonsumption / 100;
    }

    public double Moving(double x) {
        if (liters <= x * fuelСonsumption)
            System.out.println("need to add fuel!");
        else
            this.x += x;
        return this.x;
    }

    public double Refueling(double liters) {
        return this.liters + liters;
    }

    public double DistanceFrom0() {
        return x;
    }

    public double FuelLevel() {
        return liters - x * fuelСonsumption;
    }
}
