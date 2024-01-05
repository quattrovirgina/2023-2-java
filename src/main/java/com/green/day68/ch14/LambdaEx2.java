package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf = new MyFunction2() {
            @Override
            public void myMethod() {
                System.out.println("HI THERE");
            }
        };

        // MyFunction2 mf = () -> system.out.println("HI THERE");

        mf.myMethod();

    }
}
