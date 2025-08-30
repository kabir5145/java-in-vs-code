package com.company;

import java.util.Scanner;

public class swap_num {
    public static void main(String[] args) {
        // swap two numbers without using third variable
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int b = sc.nextInt();
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}