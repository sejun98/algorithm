package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int cnt = 0; int sum = 0; int sum2 =0;
            String str = sc.next();
            String[] add = new String[size];
            add[i] = str;
            for (int j = 0; j < add[i].length(); j++) {
                if (add[i].charAt(j) == 'O') {
                    cnt++;
                    sum = cnt;
                } else if (add[i].charAt(j) == 'X') {
                    sum = 0;
                    cnt = 0;
                }
                sum2 += sum;
            }
            System.out.println(sum2);
        }
    }
}