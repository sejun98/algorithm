package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            list1.add(a);
        }
        for (int i = 1; i <= 30; i ++) {
            list2.add(i);
        }
        list2.removeAll(list1);
        for (int i = 0; i < 2; i++) {
            System.out.println(list2.get(i));
        }
    }
}