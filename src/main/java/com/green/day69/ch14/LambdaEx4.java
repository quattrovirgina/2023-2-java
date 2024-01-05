package com.green.day69.ch14;

import com.azul.tooling.ConsumerManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        } // 기존의 for문

        for(Integer val : list) {
            System.out.println(val);
        } // 향상된 for문

        // list.forEach();
        // consumer 인터페이스 타입으로 받으려는것
        // 부모로써만 역할을 하는 것이라 스스로를 상속받아서 구현한다
        list.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer o) {
                System.out.println("MY CONSUMER(2) : " + o);
            }

        });
        list.forEach(i -> System.out.println("YOUR CONSUMER(3) : " + i));
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });

        list.removeIf(v -> { return v * 2 == 0; } );
        System.out.println(list);
        System.out.println("--------------------------");
        list.replaceAll(v -> v <= 15 ? v * 3 : v);
        System.out.println(list);
        System.out.println("--------------------------");
        Map<String, String> map = new HashMap();
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");
        map.forEach((k, v) -> System.out.printf("%s: %s\n", k, v));
    }
}

class MyConsumer<T> implements Consumer<T> {

    @Override
    public void accept(T o) {
        System.out.println("MYCONSUMER(1) : " + o);
    }
}
