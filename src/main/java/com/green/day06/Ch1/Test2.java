package com.green.day06.Ch1;

public class Test2 {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            System.out.println("for - " + i);
            i++;
            if(i == 5) {
                System.out.println("그만해 임마");
            }
            continue;
        }
    }
 }
