package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요 >>");

        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();

        switch (mon) {
            case 3, 4, 5:
                System.out.println("현재 계절은 봄 입니다.");
                break;
            case 7, 8, 6:
                System.out.println("현재 계절은 여름 입니다.");
                break;
            case 9, 10, 11:
                System.out.println("현재 계절은 가을 입니다.");
                break;
            case 12, 1, 2:
                System.out.println("현재 계절은 겨울 입니다.");
                break;
            default:
                System.out.println("잘못된 값을 입력하셨습니다.");
        }
    }
}
