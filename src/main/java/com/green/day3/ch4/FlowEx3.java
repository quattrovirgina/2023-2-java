package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx3 {
    public static void main(String[] args) {
        //콘솔 숫자를 하나 입력하세요
        //해당값이 홀수면 00은 홀수입니다
        //해당값이 짝수면 00은 짝수힙니다
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 하나 입력하세요>");

        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        if(num % 2 == 0) {System.out.printf("%d는 짝수입니다.", num);}
        else {System.out.printf("%d는 홀수입니다.", num);}
    }
}
