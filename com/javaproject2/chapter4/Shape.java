package com.javaproject2.chapter4;

public abstract class Shape extends Point{

    protected Point point;

    public Shape(Point center){
        this.point = center;
    }

    public void moveBy(double dx, double dy){
        double x=point.getX()+dx;
        double y=point.getY()+dy;
    }

    public abstract Point getCenter();
}
