package com.javaproject2.chapter1;

import java.math.BigInteger;

public class Exercise6 {

    public Exercise6(){
    }

    public void Factorial(int intFact)
    {
        BigInteger result = BigInteger.ONE;
        for( int i=1; i <= intFact; i++)
        {result = result.multiply(BigInteger.valueOf(i));}
        System.out.println("Factorial = " + result);;
    }
}
