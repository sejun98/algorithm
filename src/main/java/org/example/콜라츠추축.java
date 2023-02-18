package org.example;

import java.util.ArrayList;

public class 콜라츠추축 {
    public static void main(String[] args) {
        int num = 626331;
        long n = num;
        int answer = 0;
        while (n != 1) {
            if ( n % 2 == 0) {
                n = n / 2;
                answer++;
            } else if ( n % 2 != 0) {
                n = n * 3 + 1;
                answer++;
            }
        }
        if (answer >= 500) {
            answer = -1;
        }
        System.out.println(answer);
    }
}