package com.green.day3.ch4;

public class AssignmentOperators2 {
    public static void main(String[] args) {
        int r1  = 0, n1 = 0 , a1 = 0;
        //++을 먼저 쓰면 ++을 먼저 하고 대입을 한다
        r1 = ++n1;
        ++a1;
        System.out.printf("r1 : %d, n1 : %d, a1: %d\n" , r1 , n1, a1);
        //++을 뒤에 쓰면 값을 먼저 대입을 하고 ++을 한다
        int r2 = 0, n2 = 0 , a2 = 0;
        r2 = n2++;
        a2++;
        System.out.printf("r2 : %d, n2 : %d, a2 : %d\n" ,r2 ,n2, a2);
    }
}
