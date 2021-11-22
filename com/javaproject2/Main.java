package com.javaproject2;

import com.javaproject2.chapter1.*;
import com.javaproject2.chapter2.Car;
import com.javaproject2.chapter2.PointChapter2;
import com.javaproject2.chapter3.Employee;
import com.javaproject2.chapter3.Measurable;
import com.javaproject2.chapter4.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Сhapter 1!");

        System.out.println("Exercise 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = in.nextInt();
        Exercise1 exercise1=new Exercise1(number);
        exercise1.NumberOutput(number);

         System.out.println("\nExercise 2");
         System.out.print("Enter the angle: ");
         Scanner in2 = new Scanner(System.in);
         int angle = in2.nextInt();
         Exercise2 exercise2=new Exercise2(angle);
         exercise2.AngleOutput(angle);
         exercise2.AngleOutput2(angle);

        System.out.println("\nExercise 3");
        Scanner in3 = new Scanner(System.in);
        int num = in3.nextInt();
        int num1 = in3.nextInt();
        int num2 = in3.nextInt();
        Exercise3 exercise3=new Exercise3(num, num1, num2);
        exercise3.Maximum();
        exercise3.Maximum2();

        System.out.println("\nExercise 4");
        Exercise4 exercise4=new Exercise4();
        exercise4.MaxMinDouble();


        System.out.println("\nExercise 6");
        Exercise6 exercise6=new Exercise6();
        exercise6.Factorial(1000);

        System.out.println("\nExercise 13");
        Exercise13 exercise13=new Exercise13();
        System.out.println("Lottery Combination: " + exercise13.LotteryCombination());


        System.out.println("\nСhapter 2!");
        System.out.println("\nExercise 5");
        PointChapter2 pointChp2= new PointChapter2(3,4).translate(1,3).scale(0.5);
        System.out.println(pointChp2);

        System.out.println("\nExercise 9");
        Car car=new Car(2,2);
        System.out.println(car.Moving(10));
        System.out.println(car.FuelLevel());


        System.out.println("\nСhapter 3!");
        Employee employee = new Employee("Masha", 4);
        Employee employee1= new Employee("Sasha", 7);
        Employee[] employees = new Employee[2];
        employees[0] = employee;
        employees[1] = employee1;
        System.out.println("Average salary is: " + Employee.average(employees));
        System.out.println("Max salary is: " + (Measurable)Employee.largest(employees));


        System.out.println("\nСhapter 4!");
        Point point =new Point(2,2);
        Point point2 =new Point(4,4);
        Line line=new Line(point,point2);
        Circle circle=new Circle(point,3);
        Rectangle rectangle=new Rectangle(point,4,4);
        System.out.println(line.getCenter());
        System.out.println(circle.getCenter());
        System.out.println(rectangle.getCenter());
        System.out.println("Clone: " + point.clone());
    }
}
