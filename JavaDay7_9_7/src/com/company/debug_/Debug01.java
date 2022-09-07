package com.company.debug_;

import java.util.Arrays;

public class Debug01 {
    public static void main(String[] args) {
        int [] arr={1,2,9,4,7};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        System.out.println("100");
    }
}
