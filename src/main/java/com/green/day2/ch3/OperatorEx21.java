package com.green.day2.ch3;

public class OperatorEx21 {
    public static void main(String[] arg) {
        int n1 = 10, n2 = 10, n3 = 11, n4 = 9;
        System.out.printf("%d < %d : %b\n", n1, n2, n1 < n2);
        System.out.printf("%d < %d : %b\n", n1, n3, n1 < n3);
        System.out.printf("%d <= %d : %b\n", n1, n4, n1 < n4);
        System.out.printf("%d <= %d : %b\n", n1, n2, n1 <= n2);
        System.out.println("---------------------------------" );
        System.out.printf("%d > %d : %b\n", n1, n2, n1 > n2);
        System.out.printf("%d >= %d : %b\n", n1, n2, n1 >= n2);
        System.out.printf("%d >= %d : %b\n", n1, n3, n1 >= n3);
        System.out.printf("%d > %d : %b\n", n1, n3, n1 > n3);
        System.out.printf("%d >= %d : %b\n", n1, n4, n1 >= n4);
        System.out.printf("%d > %d : %b\n", n1, n4, n1 > n4);
        System.out.println("------------------------------------");
        System.out.printf("%d == %d : %b\n", n1, n2, n1 == n2);
        System.out.printf("%d != %d : %b\n", n1, n2, n1 != n2);
        System.out.printf("%d == %d : %b\n", n1, n3, n1 == n3);
        System.out.printf("%d != %d : %b\n", n1, n3, n1 != n3);
        System.out.printf("%d != %d : %b\n", n1, n4, n1 != n4);


    }
}
