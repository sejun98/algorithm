package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nv = sc.nextInt();
            li.add(nv);
        }
        int v = sc.nextInt();
        int z = 0;
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) == v ) {
                z += 1;
            }
        }
        System.out.println(z);
    }
}