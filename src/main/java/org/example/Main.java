package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long answer = 0;
        int n = 3;
        double num = Math.sqrt(n);
        if (n % num == 0) {
            answer = (long) Math.pow(num+1,2);
        } else answer = -1;
    }
}