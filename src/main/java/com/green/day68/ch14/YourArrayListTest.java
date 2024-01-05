package com.green.day68.ch14;

public class YourArrayListTest {
    public static void main(String[] args) {
        YourArrayList li = new YourArrayList();
        li.add(10);
        li.add(13);
        li.add(16);
        li.add(19);
        li.add(22);
        li.add(12);

        li.forEach(i -> System.out.println("i : " + i));
        li.removeIf2(v -> v % 2 == 0);
        li.forEach(v -> System.out.println(v + ","));
    }
}
