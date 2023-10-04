package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Misson {
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


        int gender = 0;
        int heigh = 0;
        System.out.print("성별을 입력해주세요 남성=1 여성=2");
        Scanner scan = new Scanner(System.in);
        gender = scan.nextInt();
        System.out.print("신장을 입력하세요>");
        heigh = scan.nextInt();

        if (gender == 1){
            String fm = "남자";
        }

        else {
            String fm = "여자";
        }

    }
}