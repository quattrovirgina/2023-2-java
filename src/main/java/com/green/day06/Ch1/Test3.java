package com.green.day06.Ch1;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("1부터 100까지의 숫자입력 (종료: 0) >> ");
        int input = s.nextInt();

        while(input != 0) {
            System.out.print("1부터 100까지의 숫자입력 (종료: 0) >> ");
            input = s.nextInt();
        }
        System.out.println("끝!!!");
    }
}
