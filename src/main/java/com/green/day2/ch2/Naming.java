package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {
        //1.  대소문자 구별. 길이제한x
        int abc, aBc, abC;

        //2 이름으로 예약어 사용 x
        // 예)int int, vioc static; (x)

        //3 . 숫자로 시작하면 안된다
        // 예) int 1ab (x)

        //4. 특수문자 _, $ 만 사용가능
        //-------------------------------------------------------

        // 케이스 기법

        // 1. 파스칼 케이스 기법(클래스 명)
        // HelloMyNameIsWoong

        // 2. 카멜 케이스 기법 (변수명, 메소드 명)
        // helloMyNameIsWoong(첫 단어 제외 나머지 대문자)

        // 3. 케밥 케이스 기법(자바x CSS기법)
        // hello-my-name-is-woong

        // 4. 스네이크 케이스 기법
        // hello_my_name_is_woong
        //-----------------------------

        //상수는 전부 대문자 구분은 언더바

        // PI, MAX_NUMBER
        final int PI = 0, MAX_NUMBER = 10;
        //레퍼런스 변수
        Date today = new Date();
    }
}

/*

 */