package com.green.day2.ch2;

public class CatingEx1 {
    public static void main(String[] arg) {
        double d = 85.4;
        int score = (int)d;
        System.out.println("score :" + score);
        System.out.println("d :" + d);

        byte b1 = 127;
        short s1 = b1;
        int i1 = s1;

        System.out.println("s1 :" + s1);

        float f1 = i1;
        int i2 = (int)f1;

    }
}
