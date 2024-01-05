package com.green.day69.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        Function<String, Integer> f = v -> Integer.parseInt(v);

        Function<String, Integer> f2 = Integer::parseInt;

        System.out.println(f.apply("12") * 2);
        System.out.println(f2.apply("100") * 2);

        BiFunction<String, String, Boolean> f3 = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> f4 = String::equals;

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");

        System.out.println("s1 == s2" + (s1 == s2));
        System.out.println(f3.apply(s1, s2));
        System.out.println(f4.apply(s1, s2));
    }
}
