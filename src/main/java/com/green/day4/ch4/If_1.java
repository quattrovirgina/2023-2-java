package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        System.out.println("성별을 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        String gender = scan.nextLine();
        String com = "누구냐";

        if ("남자".equals(gender)) {
            com = "잘생겼다";
        } else if ("여자".equals(gender)) {
            com = "이쁘다";
        }
        System.out.printf(com);
    }
}