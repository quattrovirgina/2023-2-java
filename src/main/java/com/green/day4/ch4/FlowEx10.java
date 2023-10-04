package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'F';
        Scanner scan = new Scanner(System.in);
        System.out.println("당신의 점수를 입력하세요.");
        String tmp = scan.nextLine();
        score = Integer.parseInt(tmp);
        if (score < 0 || 100 < score) {
            System.out.println("다시 입력해 주세요");
        } else {
            int a = score / 10;

            switch (a) {
                case 10, 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
            }
            System.out.printf("당신의 학점은 %c입니다\n", grade);
        }
    }
}