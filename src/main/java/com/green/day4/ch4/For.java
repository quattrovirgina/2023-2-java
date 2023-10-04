package com.green.day4.ch4;

public class For {
    public static void main(String[] args) {
        //첫번째: 초기화 공강
        //두번째: 반복여부 체크
        //세번째: 증감식
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int f = 0;

        for ( ; f<10 ; ){
            System.out.println("f : " + ++f);
        }
    }
}
