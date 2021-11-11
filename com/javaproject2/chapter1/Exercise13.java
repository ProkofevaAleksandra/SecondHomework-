package com.javaproject2.chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise13 {
    private static final int ELEMENTS_LOTTERY = 6;
    private static final int ELEMENTS_NUMBER = 49;
    ArrayList<Integer> number = new ArrayList<Integer>();

    public Exercise13(){
        for( int i=0; i < ELEMENTS_NUMBER; i++){
            number.add(1+i);
        }
    }

    private int Random(){
        final int max = ELEMENTS_NUMBER+1;
        return (int) (Math.random()* max);

    }

    public  ArrayList<Integer> LotteryCombination() {
        ArrayList<Integer> arrayLottery = new ArrayList<Integer>();

        for( int i=0; i < ELEMENTS_LOTTERY; i++){
            int index = Random();
            arrayLottery.add(number.get(index));
        }
         return arrayLottery;
        }
}
