package com.green.day4.ch4;

public class RandomValMisson {
    public static void main(String[] args) {
        double a = Math.random();
        int rVal = (int) (a * 10);

        System.out.println("rVal :" + rVal);
//14-23
        int rVal2 = (int) (a * 10) + 14;

        System.out.println("rVal2 : " + rVal2);
    }
}
