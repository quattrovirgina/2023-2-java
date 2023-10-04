package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Misson {
    public static void main(String[] args) {
        System.out.println("*을 출력할 라인의 수를 입력하세요>>");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int a = 1; a <= x - i; a++) {
                System.out.print("_");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for (int i = 1; i <= x; i++) {
            for (int m = x - i; m > 0; m--) {
                System.out.print("_");
            }
            for (int m = 0; m < i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
        for (int i = x; i > 0; i--) {
            for (int a = 1; a <= x; a++) {
                if (a < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
