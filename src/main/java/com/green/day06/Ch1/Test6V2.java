package com.green.day06.Ch1;

import java.util.Scanner;
public class Test6V2 {

    public static void main(String[] args) {
        int input = 0;
        int answer = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);

        while(input != answer) {
            System.out.println("0부터 100까지의 수를 입력하자: ");
            input = sc.nextInt();

            if(input < answer) {
                System.out.println("다운");
            }
            if(input > answer) {
                System.out.println("업");
            }
        }
        System.out.println("내가 졌다 이놈아");
    }
}
