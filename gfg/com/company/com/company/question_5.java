package com.company;

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        //Given a 2D integer array mat[][] and a number x, find whether element x is present in the matrix or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the numbers of rows :");
        int a = sc.nextInt();
        System.out.println("Insert the numbers of columns: ");
        int b = sc.nextInt();
        int[][] number = new int[a][b];
        //the number to find
        System.out.println("We have to find the number is:");
        int x = sc.nextInt();

        System.out.println("Now insert the numbers in the matrix in the following rows and columns:");

        //input
        for(int i = 0;i<a;i++){
            for(int k = 0;k<b;k++){
                number[i][k]= sc.nextInt();
            }
        }
        for(int i = 0;i<a;i++){
            for(int k = 0;k<b;k++){
                System.out.print(number[i][k]+" ");
            }
            System.out.println();
        }
        boolean found = false;
        for(int i = 0;i<a;i++){
            for(int k = 0;k<b;k++){
                if(number[i][k]==x){
                    found = true;
                    break;
                }
            }
        }
        if(found){
            System.out.println("We have found the number !");
        }else{
            System.out.println("Not found the number !");
        }
    }
}
