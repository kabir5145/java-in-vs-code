
// Given an array arr. Your task is to find the minimum and maximum elements in the array.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Collections.max(list);
    }
}