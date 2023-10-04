package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("-----------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("--------------");
        System.out.printf("Halo\n"); //이스케이프
        System.out.printf("Halo\n"); //이스케이프
        System.out.printf("Halo\n"); //이스케이프
        System.out.printf("Halo\n"); //이스케이프
        System.out.println("-----------");
        System.out.println();

        String name = "홍길동";
        int age = 23;
        char bloodType = 'B';
        double height = 178.8;

        // 제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 B형이고, 키는 178.8cm입니다.

        System.out.println("제 이름은 " + "name" + "이고," + "나이는 " +
                "age" + "세이고," +
                "형액형은 " +
                "bloodType" +
                "형이고," + "키는" +
                "height"+ "cm입니다.");

    }
}
