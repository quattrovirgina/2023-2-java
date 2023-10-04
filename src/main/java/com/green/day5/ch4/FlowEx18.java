package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int m = 1; m <= 9; m++) {
                System.out.printf("%d x %d = %d\n", i, m, m * i);

            }
            System.out.println();
        }
    }
}
