package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n;
        int a = 0;
        while (n > 0) {
            n = n / 10;
            a++;
        }
        int[] answer =  new int[a];
        System.out.println(a);
        for(int i = 0; i < a; i++) {
            answer[i] = b % 10;
            b/=10;
            System.out.println(answer[i]);
        }
    }
}