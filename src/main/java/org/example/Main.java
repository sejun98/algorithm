package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Solution {
            public double solution(int[] arr) {
                double answer = 0;
                for (int i = 0; i < arr.length; i++) {
                    answer += arr[i];
                }
                return answer/arr.length;
            }
        }

    }
}