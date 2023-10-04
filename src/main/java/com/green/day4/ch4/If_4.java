package com.green.day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        double a = Math.random();
        int b = (int)(a * 151)  + 50;
        System.out.println(b);
        System.out.printf("%d" , b > 100 ? b +10 : b * 2 );
    }
}
