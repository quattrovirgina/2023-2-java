package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx3v2 {
    public static void main(String[] args) {
        //콘솔 숫자를 하나 입력하세요
        //해당값이 홀수면 00은 홀수입니다
        //해당값이 짝수면 00은 짝수힙니다
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요>");

        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        if (num == 0) {
            System.out.printf("다른 값을 입력해 주세요.");
        } else {
            System.out.printf("%d 은(는) %s수 입니다", num, num % 2 == 0 ? "짝" : "홀");
        }
    }
}

