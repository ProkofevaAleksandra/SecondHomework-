package com.javaproject2.chapter4;

public class Line extends Shape{

    private Point from ;
    private Point to;

    public Line(Point from, Point to){
        this.from=from;
        this.to=to;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return new Line(from.clone(), to.clone());
    }

    @Override
    public Point getCenter() {
        double x= (to.getX()+from.getX())/2;
        double y =(to.getY()+from.getY())/2;
        return new Point(x, y);
    }
}
