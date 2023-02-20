package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        // 출력을 위한 예시
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int count = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
//            return answer;
        }
        int[] answer = new int[count];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[zero] = arr[i];
                zero++;
            }
        }

        Arrays.sort(answer);
//        return answer;
    }
}