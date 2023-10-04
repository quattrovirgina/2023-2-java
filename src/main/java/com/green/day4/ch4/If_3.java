package com.green.day4.ch4;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        String general = "홀수";
        int val = (int) (Math.random() * 100) + 1;
        if (val % 2 == 0) {
            general = "짝수";
        }
        System.out.printf("%d은(는) %s입니다.", val, general);
    }
}