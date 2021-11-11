package com.javaproject2.chapter4;


public class Rectangle extends Shape {

    private Point topLeft=new Point();
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height){
        this.topLeft=topLeft;
        this.width=width;
        this.height=height;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(topLeft.clone(), width, height);
    }

    @Override
    public Point getCenter() {
        return new Point(topLeft.getX()+ width/2,topLeft.getY()-height/2);
    }
}
