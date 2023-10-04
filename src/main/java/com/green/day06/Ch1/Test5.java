package com.green.day06.Ch1;

import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        while(true) {
            System.out.print("1~100까지의 숫자입력(종료: 0) >> ");
            input = s.nextInt();
            if(input == 0 || input > 100) {
                break;
            }
            sum += input;
        }

        System.out.println("끝 !!" + sum);
    }
}
