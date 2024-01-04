package com.green.day68.ch14;

@FunctionalInterface

interface MyFunction {
    void run();
}
public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf1 = new MyFunction() { // MyFunction을 implement한 익명클래스
            @Override
            public void run() {
                System.out.println("fm2 - running !! ");

            }
        };

        MyFunction mf2 = new MyFunctionClass();
    }
}

class MyFunctionClass implements MyFunction {
    public void run() {
        System.out.println("class name fm2 - running !! ");
    }

}
