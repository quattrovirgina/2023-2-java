package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        //중첩 반복문을 사용하여
        //가로 10개 ,세로 5개
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 10; x++) {
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }
}
