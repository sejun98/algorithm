package org.example;

import java.util.ArrayList;

public class 하샤드수 {
    public static void main(String[] args) {
        int x = 15;
        int c = x;
        int z = 0;
        boolean answer = true;
        ArrayList <Integer> arr = new ArrayList<>();
        while (x > 0) {
            arr.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < arr.size(); i++) {
            z += arr.get(i);
        }
        if (c % z == 0) {
            answer = true;
        } else if (x % z != 0){
            answer = false;
        }
        System.out.println(x);
        System.out.println(z);
        System.out.println(answer);
    }
}