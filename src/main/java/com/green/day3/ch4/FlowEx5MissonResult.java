package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5MissonResult {
    public static void main(String[] args) {
        //남자의 평균키를 170, 여자의 평균키 157
        //Scanner이용하여 성별을 입력 받습니다. (남자,여자)
        //키를 입력 받습니다.
        //평균키 미만면 "156cm는 남성 평균 이하입니다."
        //평균키와 같다면 "170은 남자 평균입니다."
        //평균키 초과면 "170cm는 남자 평균 초과입니다."

        //평균키 미만면 "156cm는 여자 평균미만 입니다."
        //평균키와 같다면 "170은 여자 평균입니다."
        //평균키 초과면 "170cm는 여자 평균초과 입니다.
        int heigh = 0;
        int gender = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요 (남자=1,여자=2).");
        gender = scan.nextInt();
        System.out.print("신장을 입력하세요>");
        heigh = scan.nextInt();
        String opt = "평균";

        if (gender == 1) {
            if (heigh > 170) {
                opt = "평균 이상";
            } else if (heigh < 170) {
                opt = "평균 이하";
            }
            System.out.printf("%dcm는 남자 %s입니다", heigh, opt);
        }
        if (gender == 2){
            if (heigh > 157) {
                opt = "평균 이상";
            } else if (heigh < 157) {
                opt = "평균 이하";
            }
            System.out.printf("%dcm는 여자 %s입니다", heigh, opt);
        }
        else {
            System.out.println("입력된 값이 부정확합니다.");}
    }
}