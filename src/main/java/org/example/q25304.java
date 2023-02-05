package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class q25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 총 가격
        int n = sc.nextInt(); // 물건의 종류 수
        int z = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // 물건의 가격
            int b = sc.nextInt(); // 물건의 수
            z += a * b;

        }
        if (x == z) {
            System.out.println("Yes");
        } else if (x != z) {
            System.out.println("No");
        }
    }
}