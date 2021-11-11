package com.javaproject2.chapter1;

public class Exercise3 {
    private int num1;
    private int num2;
    private int num3;

    public Exercise3(int num1, int num2, int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }

    public void Maximum() {
        if (num2 < num1 && num1 > num3) {
            System.out.println("Max: "+num1);
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("Max: "+num2);
        } else if (num1 < num3 && num3 > num2) {
            System.out.println("Max: "+num3);
        }
    }

    public void Maximum2() {
        System.out.println("Max 2: " + Math.max(num1, Math.max(num2,num3)));
    }
}
