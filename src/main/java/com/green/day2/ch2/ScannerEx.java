package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//new = 객체화
        //객체에는 속성(값 저장, 명사)과 메소드(기능,동사)가 있다
        System.out.println("두자리 정수를 하나 입력해 주세요>>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용: " + (input));
        System.out.printf("num=%d\n", (num));
    }
}
