package org.example;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        int n = 100;
        int x = -12;
        long[] answer = new long[n];
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x*(i+1);
            System.out.println(answer[i]);
        }
        System.out.println(1+3*2);
    }
}