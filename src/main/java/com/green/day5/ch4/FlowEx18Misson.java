package com.green.day5.ch4;

public class FlowEx18Misson {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int a = 2; a <= 9; a++) {
                System.out.printf("%d x %d = %d\t", a, i, a * i);
            }
            System.out.println();
        }
    }
}
