package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class q4344 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            double sum = 0;
            double age = 0;
            double cnt = 0;double sum2 = 0;
            double[] arr = new double[sc.nextInt()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
                age = sum/ arr.length;
            }
            for (int k=0; k<arr.length; k++)  {
                if (age < arr[k]) {
                    cnt ++;
                    sum2 = cnt / arr.length * 100;
                }
            }
            System.out.println(String.format("%.3f", sum2)+"%");
        }
    }
}