package com.javaproject2.chapter4;

public abstract class Shape {

    protected Point point = new Point();

    public Shape(){
    }

    public void moveBy(double dx, double dy){
        double x=point.getX()+dx;
        double y=point.getY()+dy;
    }

    public abstract Point getCenter();
}
