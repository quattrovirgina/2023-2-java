package com.green.day2.ch3;

public class Operator23 {
    public static void main(String[] arg) {
        String s1 = "Hello" , s2 = "Hello";
        String s3 = new String("Hello");

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2);
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1));
        //자바에서 ==은 equals를 써야한다
        //reference type에서 == 비교는 주소값 비교


    }
}
