package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score 값이 90점보다 같거나 크면 A학점
        //score 값이 80점보다 같거나 크면 B학점
        //score 값이 70점보다 같거나 크면 C학점
        //나머지는 D학점
        char grade = 'D';

        if (score >= 90) {
            grade ='A';
        } else if (score >= 80) {
            grade ='B';
        } else if (score >= 70) {
            grade ='C';
        }
        System.out.printf("%c학점\n" , grade);
    }
}