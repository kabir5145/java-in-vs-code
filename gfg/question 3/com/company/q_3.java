package com.company;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        /*  In this problem we will learn how to read inputs.
You are given five inputs: a(integer), b(float ), c(long), d(byte), and s(string) respectively. 
You need to use the scanner class object and then take all the input and print each in a new line.
Note: Consider using sc.nextLine( ) after byte input to handle any issues with input reading.
*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        byte d = sc.nextByte();
        sc.nextLine(); // Consume the newline character after byte input
        String s = sc.nextLine();

        System.out.println(a);
        System.out.println(b);  
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
}