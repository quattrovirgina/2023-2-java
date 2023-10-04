package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Result {
    public static void main(String[] args) {
        //스캐너를 이용하여 정수를 입력 받는다.
        //"*을 출력할 라인의 수를 입력하세요>>
        System.out.println("*을 출력할 라인의 수를 입력하세요>>");
        int i= 2;
        for (int m = 0; m <= i; m++) {
            System.out.print("*");
        }
    }
}
