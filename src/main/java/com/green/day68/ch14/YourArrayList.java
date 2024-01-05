package com.green.day68.ch14;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class YourArrayList {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public YourArrayList() {
        arr = new int[0];
    }

    public void add(int v) {
        int[] newone = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newone[i] = arr[i];
        }
        newone[arr.length] = v;
        arr = newone;
    }

    public void forEach(Consumer<Integer> co) {
        for (int i = 0; i < arr.length; i++) {
            co.accept(arr[i]);

        }

    }

    public void removeIf2(Predicate<Integer> pre) {
        YourArrayList tempList = new YourArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(!pre.test(arr[i])) {
                tempList.add(arr[i]);
            }
        }
        this.arr = tempList.getArr();
    }

    public void removeIf( Predicate<Integer> convoy) {
        int[] temp = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if(!convoy.test(arr[i])) {
                int[] temp2 =new int[temp.length];

                for (int z = 0; z < temp.length; z++) {
                    temp2[z] = temp[z];
                }

                temp2[temp.length] = arr[i];
                temp = temp2;
            }
        }
        arr = temp;
    }

}
