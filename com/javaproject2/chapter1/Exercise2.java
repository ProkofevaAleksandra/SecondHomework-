package com.javaproject2.chapter1;

public class Exercise2 {
    private int intAngle;

    public Exercise2(int intAngle){
        this.intAngle=intAngle;
    }

    public void AngleOutput(int intNumber){
        System.out.println("Angle: " + (intNumber % 360 + 360) % 360);
    }

    public void AngleOutput2(int intNumber){
        System.out.println("Angle 2: " + Math.floorMod(intNumber,360));
    }
}
