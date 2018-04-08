// Problem : https://www.hackerrank.com/challenges/plus-minus/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        double plus = 0, min = 0, zero = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0) {
                plus++;
            }else if(arr[i] < 0) {
                min++;
            }else {
                zero++;
            }
        }
        System.out.printf("%.6f\n", plus/arr.length);
        System.out.printf("%.6f\n", min/arr.length);
        System.out.printf("%.6f\n", zero/arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}