package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요>");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score 값이 90점보다 같거나 크면 A학점
        //score 값이 80점보다 같거나 크면 B학점
        //1의 자리수가 8이상이면 +, 3이하이면-, 나머지는 없음
        //나머지는 C학점

        if (score >= 90) {
            if (score >= 98)
            {System.out.println("A+");}
            else if (98 > score & score > 92)
            {System.out.println("A");}
            else {System.out.println("A-");}

        } else if (score >= 80)
            {if (score >= 88)
            {System.out.println("B+");}
            if (88 > score & score > 82)
            {System.out.println("B");}
            if (82 >= score)
            {System.out.println("B-");}
        }
        else {System.out.println("C");}
    }
}
