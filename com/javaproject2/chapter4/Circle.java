package com.javaproject2.chapter4;

public class Circle extends Shape{

    private double radius;
    Point center =new Point();

    public Circle(Point center, double radius){
        this.center=center;
        this.radius=radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return new Circle(center.clone(), radius);
    }

    @Override
    public Point getCenter() {
        return center;
    }
}
