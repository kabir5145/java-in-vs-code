package com.company;

import java.util.Arrays;

public class question_7 {
    public static void main(String[] args) {
        //Add the elements of an array.
        int [] arr = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
