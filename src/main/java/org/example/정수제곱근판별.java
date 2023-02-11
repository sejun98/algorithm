package org.example;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long answer = 0;
        int n = 3;
        double num = Math.sqrt(n);
        if (n % num == 0) {
            answer = (long) Math.pow(num+1,2);
        } else answer = -1;
    }
}