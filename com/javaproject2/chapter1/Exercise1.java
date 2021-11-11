package com.javaproject2.chapter1;

public class Exercise1 {
    private int intNumber;

    public Exercise1(int intNumber){
       this.intNumber=intNumber;
    }

    public void NumberOutput(int intNumber){
        String convert2 = Integer.toBinaryString(intNumber);
        String convert8 = Integer.toOctalString(intNumber);
        String convert16 = Integer.toHexString(intNumber);
        System.out.println(" Binary: "+ convert2+"\n Octal: "+ convert8+"\n Hexadecimal: "+convert16 );
        float reversNumber= Float.parseFloat(convert16);
        System.out.println(" Revers number: " + 1/reversNumber);
    }
}
