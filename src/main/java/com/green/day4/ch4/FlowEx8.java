package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민 번호를 입력 하세요. (xxxxxx-xxxxxxx) >>");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        char gender = num.charAt(7);
        //switch는 문자 문자열 정수만 입력이 가능 하다.
        switch (gender) {
            case '1', '3':
                System.out.println("당신은 남자 입니다.");
                break;
            case '2', '4':
                System.out.println("당신은 여자 입니다.");
                break;
            default:
                System.out.println("다시 입력해 주세요.");
        }
    }
}
