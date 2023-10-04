package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args){
        String name = "Ja" + "va";
        System.out.println(name);

        System.out.println("Ja"+"va");

        System.out.println("12"+ 10 + 9);
        //타입이 다르면 자동 형변환이 일어난다
        // "12" + 10 이 식은 뒤에 정수가 스트링으로 자동 변환이 된다
        // "12" + "10"
        // "1210" + 9
        // "1210" + "9"
        // "12109"
        System.out.println("12"+ (10 + 9));

        System.out.println(8 + 9 + "12");
    }
}
