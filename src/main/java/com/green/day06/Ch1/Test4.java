package com.green.day06.Ch1;

import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        do {
            System.out.print("1~100까지의 숫자 입력(종료: 0) >> ");
            input = s.nextInt();
            sum += input;
        }while(input != 0 || input != 100);

        System.out.println("끝!!");
    }
}
