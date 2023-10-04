package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEX32Misson {
    public static void main(String[] args) {
        //만약에 n이 음수였다면 콘솔에 양수로 출력
        //만약에 n이 양수라면  콘솔에 양수로 출력

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요>>");

        String input = scan.nextLine();
        int a = Integer.parseInt(input);

        if (a != 0) {System.out.printf("%d", a < 0 ? -a : a);
        }
    }
}