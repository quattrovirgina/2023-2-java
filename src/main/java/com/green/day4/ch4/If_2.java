package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        System.out.println("성별을 입력해 주세요.");
        Scanner scan = new Scanner(System.in);
        String gender = scan.nextLine();
        String com = "누구냐\n";
        if ("남".equals(gender) || "남자".equals(gender) || "man".equals(gender) || "Man".equals(gender)) {
            com = "잘 생겼다\n";
        } else if ("여".equals(gender) || "여자".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)) {
            com = "예쁘다\n";
        }
        System.out.printf(com);

    }
}