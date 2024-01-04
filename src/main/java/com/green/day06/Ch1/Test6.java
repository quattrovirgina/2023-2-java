package com.green.day06.Ch1;

import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int input = 0;
        int answer = (int)(Math.random() * 100) + 1;

        while(true) {
            System.out.println("1부터 100까지의 숫자를 입력하자 >> ");
            input = s.nextInt();

            if(input < answer) {
                System.out.println("업");
            }

            if(input > answer) {
                System.out.println("다운");
            }

            if(input == answer) {
                break;
            }
        }
        System.out.println("너이겼다 임마");
    }
}
