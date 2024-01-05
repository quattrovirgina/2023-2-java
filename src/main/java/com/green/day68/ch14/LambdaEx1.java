package com.green.day68.ch14;

@FunctionalInterface

interface MyFunction {
    void run(int n1, int n2);
}
public class LambdaEx1 {
    public static void main(String[] args) {

        MyFunction mf0 = (i ,j) -> System.out.println("mf0 - running !! ");
        // 파라미터가 1개밖에 없다면 ()는 생략가능하다
        // 한 문장일때만 생략이 가능하다
        // MyFunction mf0 = i -> { System.out.println(); };

        MyFunction mf1 = new MyFunction() { // MyFunction을 implement한 익명클래스
            public void run(int k, int l) {
                System.out.println("mf1 - running !! ");
            }
        };

        MyFunction mf2 = new MyFunctionClass();

        mf0.run(1, 2);
        mf1.run(100, 99);
        mf2.run(50, 51);
    }
}

class MyFunctionClass implements MyFunction {
    public void run(int m, int n) {
        System.out.println("class name mf2 - running !! ");
    }

}

// 장점: 똑같은 내용의 객체를 여러번 만들수 있음
// 람다 클래스는 익명클래스를 줄이기 위해서 사용