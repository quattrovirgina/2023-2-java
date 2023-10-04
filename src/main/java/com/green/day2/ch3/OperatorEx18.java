package com.green.day2.ch3;

public class OperatorEx18 {
    public static void main(String[] arg) {
        float f1 = 15.1f, f2 = 15.6f, f3 = 15.9f;

        //ceil=.올림
        System.out.printf("ceil(%f): %f\n" , f1 , Math.ceil(f1));
        System.out.printf("ceil(%f): %f\n" , f2 , Math.ceil(f2));
        System.out.printf("ceil(%f): %f\n" , f3 , Math.ceil(f3));
        System.out.printf("ceil(%f): %f\n" , 15.0 , Math.ceil(15.0));

        //floor = 내림

        System.out.printf("floor(%f): %f\n", f1 , Math.floor(f1));
        System.out.printf("floor(%f): %f\n", f2 , Math.floor(f2));
        System.out.printf("floor(%f): %f\n", f3 , Math.floor(f3));
        System.out.printf("floor(%f): %f\n", f1 , Math.floor(f1));

        //round = 반올림
        System.out.printf("round(%f): %d\n", f1 , Math.round(f1));
        System.out.printf("round(%f): %d\n", f1 , Math.round(f1));
        System.out.printf("round(%f): %d\n", f1 , Math.round(f1));

    }
}
