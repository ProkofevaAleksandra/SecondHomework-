package com.javaproject2.chapter3;

public class Employee implements Measurable {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public double getMeasure() {
        return this.salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+ " , salary: " + salary;
    }

    public static double average(Measurable[] objects) {
        double totalSum = 0;
        for (int i = 0; i < objects.length; i++) {
            totalSum += objects[i].getMeasure();
           }
        return totalSum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        double max = 0;
        int maxi = 0;
        String name;
        for (int i = 0; i < objects.length; i++) {
            if(max < objects[i].getMeasure()){
                max = objects[i].getMeasure();
                maxi = i;
            }
        }
        return  objects[maxi];
        }
}






