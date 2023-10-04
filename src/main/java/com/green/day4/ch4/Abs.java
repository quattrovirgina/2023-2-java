package com.green.day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int num = -2020021421;
        System.out.printf("%d은(는) 절대값 %d", num, num > 0 ? num : -num);

        System.out.println("------------------------------");

        if (num < 0) {
            System.out.printf("%d는(은) 절대값 %d\n", num, -num);
        }
        else {
            System.out.printf("%d는(은) 절대값 %d\n", num, num);
        }
        System.out.println("----------------------------------------------------");

        System.out.printf("%d은(는) 절대값 %d\n", num, num > 0 ? num : -num);
    }
}