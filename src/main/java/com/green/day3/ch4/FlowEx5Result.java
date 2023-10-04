package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score 값이 90점보다 같거나 크면 A학점
        //score 값이 80점보다 같거나 크면 B학점
        //1의 자리수가 8이상이면 +, 3이하이면-, 나머지는 없음
        //나머지는 C학점
        String grade = "C";
        String opt = "";
        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }
        }
        System.out.printf("%s%s 학점", grade, opt);
    }
}