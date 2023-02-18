package org.example;

import java.util.ArrayList;

public class 두사이정수의합 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int answer = 0;
        if (a < b) {
            while (a <= b) {
                answer += a;
                a++;
            }
        }
        else if (b <= a) {
            while (b <= a) {
                answer += b;
                b++;
            }
        }

        System.out.println(answer);
    }
}