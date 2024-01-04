package com.green.day06.Ch1;

import java.util.Scanner;
public class Test6V3 {
    public static void main(String[] args) {

        int input = 0;
        int answer = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        do {

            if(input == 0 || input > 100) {
                System.out.println("누가 0과 100이상의 수를 쓰라했어 다시해 임마");
            }
            System.out.println("0부터 100까지의 정수를 입력하자: ");
            input = sc.nextInt();

            if(input < answer) {
                System.out.println("업");
            }

            if(input > answer) {
                System.out.println("다운");
            }

        }while(input != answer);
        System.out.println("똑똑한놈 봐라");
    }
}
