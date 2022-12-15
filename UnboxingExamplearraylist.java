package com.techvidvan.wrapperclasses;

import java.util.ArrayList;

public class UnboxingExamplearraylist {
    public static void main(String[] args) {
        Character character = 'R'; // Autoboxing
        char value = character; // Unboxing
        System.out.println(value);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Autoboxing
        arrayList.add(50);
        // Unboxing object into int value
        int num = arrayList.get(0);
        System.out.println(num);
    }
}