package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] arge) {
    Scanner scan = new Scanner(System.in);
    System.out.println("숫자를 하나 입력하세요>");

    String input = scan.nextLine();
    int num = Integer.parseInt(input);

    if (num == 0) {System.out.println("입력하신 숫자는 0입니다.");}
    else {System.out.printf("입력하신 숫자는 %d 입니다.\n", num );}

}
}
