package com.green.day1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10 , y = 20;
        int tmp =y;

        y = x;
        x = tmp;

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
